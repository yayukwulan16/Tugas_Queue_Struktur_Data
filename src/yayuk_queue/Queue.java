/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yayuk_queue;

/**
 *
 * @author Yayuk's
 */
public class Queue {
    
    static String[] queue;
    static int ukuran;
    static int top;
    
    static void inisialisasi(int i)
    {
        ukuran=i;
        queue=new String[ukuran];
        top=0;
    }
    
    static boolean isempty()
    {
        return top<=0;
    }
    
    static boolean isfully()
    {
        return top>=ukuran;
    }
    
    static void insert(String i)
    {
        if(isfully()){
            System.out.println(i+" Mendaftar BPJS");
            System.out.println("maaf antrian penuh");
            }
        else
        {
            System.out.println(i+" Mendaftar BPJS");
            System.out.println(i+" Berhasil Mendaftar, dan Masuk Antrian");
            queue[top++]=i;
        }
    }
    
    static void pop()
    {
        if(isempty()){
            System.out.println("Peserta Dipanggil");
            System.out.println("maaf, antrian kosong");
        }
            
        else
        {
            System.out.println("Peserta Dipanggil");
            String pop=queue[0];
            int i=1;
            System.out.println("Antrian Atas Nama : "+pop+" Masuk");
            while(i<top)
            {
                queue[i-1]=queue[i];
                i++;
            }
            top--;
        }
    }
    
    
    
    static void display()
    {
        System.out.println("isi antrian :");
        int i=0;
        while(i<top)
        {
            System.out.println("antrian ke ["+(i+1)+"] :"+queue[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        Queue a=new Queue();
        a.inisialisasi(4);
        System.out.println();
        a.pop();
        System.out.println();
        a.insert("Yayuk");
        a.insert("Mori");
        a.insert("Rahmah");
        a.insert("Depi");
        System.out.println();
        a.display();
        System.out.println();
        a.insert("Jana");
        System.out.println();
        a.pop();
        System.out.println();
        a.display();
        a.pop();
        System.out.println();
        a.display();
        a.pop();
        System.out.println();
        a.display();
        a.pop();
        System.out.println();
        a.display();
        a.pop();
        System.out.println();
        a.display();
           
    }
}
