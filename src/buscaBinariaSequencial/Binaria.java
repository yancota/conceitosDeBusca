package buscaBinariaSequencial;

import java.util.*;

public class Binaria {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;

		int megaSena[] = new int[60];

		Arrays.sort(megaSena);

		megaSena[53] = 291;
		megaSena[10] = 289;
		megaSena[05] = 280;
		megaSena[42] = 276;
		megaSena[37] = 275;
		megaSena[4] = 272;
		megaSena[33] = 272;
		megaSena[23] = 271;
		megaSena[41] = 271;
		megaSena[30] = 268;
		megaSena[17] = 267;
		megaSena[44] = 267;
		megaSena[34] = 266;
		megaSena[38] = 266;
		megaSena[54] = 266;
		megaSena[28] = 265;
		megaSena[35] = 265;
		megaSena[16] = 264;
		megaSena[27] = 264;
		megaSena[29] = 263;
		megaSena[43] = 263;
		megaSena[11] = 262;
		megaSena[32] = 262;
		megaSena[49] = 262;
		megaSena[51] = 262;
		megaSena[56] = 261;
		megaSena[8] = 259;
		megaSena[36] = 259;
		megaSena[24] = 258;
		megaSena[02] = 257;
		megaSena[13] = 257;

		System.out.println("Insira o número que deseja saber quantas vezes foi sorteado: ");
		x = input.nextInt();

		int inicio = 0;
		int meio = 0;
		int fim = 60;

		while (inicio <= fim) {
			meio = (fim + inicio) / 2;
			if (meio == x) {
				System.out.println("O número " + x + " foi encontrado " + megaSena[x] + " vezes");
				break;
			}
			if (meio > x) {
				fim = meio;
			} else if (meio < x) {
				inicio = meio;
			}
		}
		
		input.close();
	}
}
