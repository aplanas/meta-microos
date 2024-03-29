SUMMARY = "Type1 subfonts of Nanum Korean fonts"
DESCRIPTION = "Nanum is a unicode font designed especially for Korean-language \
script. The font was designed by Sandoll Communication and \
Fontrix; it includes the sans serif (gothic), serif (myeongjo), \
pen script and brush script typefaces. The package provides \
Type1 subfonts converted from Nanum Myeongjo (Regular and \
ExtraBold) and Nanum Gothic (Regular and Bold) OTFs. C70, LUC, \
T1, and TS1 font definition files are also provided. (The \
package does not include OpenType/TrueType files, which are \
available from Naver)"
LICENSE = "OFL-1.1"

PV = "2023.209.3.0svn29558"

RPM_NAME = "texlive-nanumtype1-2023.209.3.0svn29558-55.1.noarch.rpm"
RPM_HASH = "7a9d2a45e4533eb430c257d74dba0d96768ac999ed1c30d85974e5cc47022f1bd2302ca7ab5934c067ef22aaeee4cb26e688eba14f0c8d5dc78f9ba2e38eb05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-c70nanumgt.fd \
tex-c70nanummj.fd \
tex-c70uhcmj.fd \
tex-lucnanumgt.fd \
tex-lucnanummj.fd \
tex-nanumfonts.map \
tex-nanumgtb00.tfm \
tex-nanumgtb01.tfm \
tex-nanumgtb02.tfm \
tex-nanumgtb03.tfm \
tex-nanumgtb04.tfm \
tex-nanumgtb11.tfm \
tex-nanumgtb20.tfm \
tex-nanumgtb21.tfm \
tex-nanumgtb22.tfm \
tex-nanumgtb23.tfm \
tex-nanumgtb24.tfm \
tex-nanumgtb25.tfm \
tex-nanumgtb26.tfm \
tex-nanumgtb27.tfm \
tex-nanumgtb2a.tfm \
tex-nanumgtb30.tfm \
tex-nanumgtb31.tfm \
tex-nanumgtb32.tfm \
tex-nanumgtb33.tfm \
tex-nanumgtb4e.tfm \
tex-nanumgtb4f.tfm \
tex-nanumgtb50.tfm \
tex-nanumgtb51.tfm \
tex-nanumgtb52.tfm \
tex-nanumgtb53.tfm \
tex-nanumgtb54.tfm \
tex-nanumgtb55.tfm \
tex-nanumgtb56.tfm \
tex-nanumgtb57.tfm \
tex-nanumgtb58.tfm \
tex-nanumgtb59.tfm \
tex-nanumgtb5a.tfm \
tex-nanumgtb5b.tfm \
tex-nanumgtb5c.tfm \
tex-nanumgtb5d.tfm \
tex-nanumgtb5e.tfm \
tex-nanumgtb5f.tfm \
tex-nanumgtb60.tfm \
tex-nanumgtb61.tfm \
tex-nanumgtb62.tfm \
tex-nanumgtb63.tfm \
tex-nanumgtb64.tfm \
tex-nanumgtb65.tfm \
tex-nanumgtb66.tfm \
tex-nanumgtb67.tfm \
tex-nanumgtb68.tfm \
tex-nanumgtb69.tfm \
tex-nanumgtb6a.tfm \
tex-nanumgtb6b.tfm \
tex-nanumgtb6c.tfm \
tex-nanumgtb6d.tfm \
tex-nanumgtb6e.tfm \
tex-nanumgtb6f.tfm \
tex-nanumgtb70.tfm \
tex-nanumgtb71.tfm \
tex-nanumgtb72.tfm \
tex-nanumgtb73.tfm \
tex-nanumgtb74.tfm \
tex-nanumgtb75.tfm \
tex-nanumgtb76.tfm \
tex-nanumgtb77.tfm \
tex-nanumgtb78.tfm \
tex-nanumgtb79.tfm \
tex-nanumgtb7a.tfm \
tex-nanumgtb7b.tfm \
tex-nanumgtb7c.tfm \
tex-nanumgtb7d.tfm \
tex-nanumgtb7e.tfm \
tex-nanumgtb7f.tfm \
tex-nanumgtb80.tfm \
tex-nanumgtb81.tfm \
tex-nanumgtb82.tfm \
tex-nanumgtb83.tfm \
tex-nanumgtb84.tfm \
tex-nanumgtb85.tfm \
tex-nanumgtb86.tfm \
tex-nanumgtb87.tfm \
tex-nanumgtb88.tfm \
tex-nanumgtb89.tfm \
tex-nanumgtb8a.tfm \
tex-nanumgtb8b.tfm \
tex-nanumgtb8c.tfm \
tex-nanumgtb8d.tfm \
tex-nanumgtb8e.tfm \
tex-nanumgtb8f.tfm \
tex-nanumgtb90.tfm \
tex-nanumgtb91.tfm \
tex-nanumgtb92.tfm \
tex-nanumgtb93.tfm \
tex-nanumgtb94.tfm \
tex-nanumgtb95.tfm \
tex-nanumgtb96.tfm \
tex-nanumgtb97.tfm \
tex-nanumgtb98.tfm \
tex-nanumgtb99.tfm \
tex-nanumgtb9a.tfm \
tex-nanumgtb9b.tfm \
tex-nanumgtb9c.tfm \
tex-nanumgtb9d.tfm \
tex-nanumgtb9e.tfm \
tex-nanumgtb9f.tfm \
tex-nanumgtbac.tfm \
tex-nanumgtbad.tfm \
tex-nanumgtbae.tfm \
tex-nanumgtbaf.tfm \
tex-nanumgtbb0.tfm \
tex-nanumgtbb1.tfm \
tex-nanumgtbb2.tfm \
tex-nanumgtbb3.tfm \
tex-nanumgtbb4.tfm \
tex-nanumgtbb5.tfm \
tex-nanumgtbb6.tfm \
tex-nanumgtbb7.tfm \
tex-nanumgtbb8.tfm \
tex-nanumgtbb9.tfm \
tex-nanumgtbba.tfm \
tex-nanumgtbbb.tfm \
tex-nanumgtbbc.tfm \
tex-nanumgtbbd.tfm \
tex-nanumgtbbe.tfm \
tex-nanumgtbbf.tfm \
tex-nanumgtbc0.tfm \
tex-nanumgtbc1.tfm \
tex-nanumgtbc2.tfm \
tex-nanumgtbc3.tfm \
tex-nanumgtbc4.tfm \
tex-nanumgtbc5.tfm \
tex-nanumgtbc6.tfm \
tex-nanumgtbc7.tfm \
tex-nanumgtbc8.tfm \
tex-nanumgtbc9.tfm \
tex-nanumgtbca.tfm \
tex-nanumgtbcb.tfm \
tex-nanumgtbcc.tfm \
tex-nanumgtbcd.tfm \
tex-nanumgtbce.tfm \
tex-nanumgtbcf.tfm \
tex-nanumgtbd0.tfm \
tex-nanumgtbd1.tfm \
tex-nanumgtbd2.tfm \
tex-nanumgtbd3.tfm \
tex-nanumgtbd4.tfm \
tex-nanumgtbd5.tfm \
tex-nanumgtbd6.tfm \
tex-nanumgtbd7.tfm \
tex-nanumgtbf9.tfm \
tex-nanumgtbfa.tfm \
tex-nanumgtbff.tfm \
tex-nanumgtbo00.tfm \
tex-nanumgtbo01.tfm \
tex-nanumgtbo02.tfm \
tex-nanumgtbo03.tfm \
tex-nanumgtbo04.tfm \
tex-nanumgtbo11.tfm \
tex-nanumgtbo20.tfm \
tex-nanumgtbo21.tfm \
tex-nanumgtbo22.tfm \
tex-nanumgtbo23.tfm \
tex-nanumgtbo24.tfm \
tex-nanumgtbo25.tfm \
tex-nanumgtbo26.tfm \
tex-nanumgtbo27.tfm \
tex-nanumgtbo2a.tfm \
tex-nanumgtbo30.tfm \
tex-nanumgtbo31.tfm \
tex-nanumgtbo32.tfm \
tex-nanumgtbo33.tfm \
tex-nanumgtbo4e.tfm \
tex-nanumgtbo4f.tfm \
tex-nanumgtbo50.tfm \
tex-nanumgtbo51.tfm \
tex-nanumgtbo52.tfm \
tex-nanumgtbo53.tfm \
tex-nanumgtbo54.tfm \
tex-nanumgtbo55.tfm \
tex-nanumgtbo56.tfm \
tex-nanumgtbo57.tfm \
tex-nanumgtbo58.tfm \
tex-nanumgtbo59.tfm \
tex-nanumgtbo5a.tfm \
tex-nanumgtbo5b.tfm \
tex-nanumgtbo5c.tfm \
tex-nanumgtbo5d.tfm \
tex-nanumgtbo5e.tfm \
tex-nanumgtbo5f.tfm \
tex-nanumgtbo60.tfm \
tex-nanumgtbo61.tfm \
tex-nanumgtbo62.tfm \
tex-nanumgtbo63.tfm \
tex-nanumgtbo64.tfm \
tex-nanumgtbo65.tfm \
tex-nanumgtbo66.tfm \
tex-nanumgtbo67.tfm \
tex-nanumgtbo68.tfm \
tex-nanumgtbo69.tfm \
tex-nanumgtbo6a.tfm \
tex-nanumgtbo6b.tfm \
tex-nanumgtbo6c.tfm \
tex-nanumgtbo6d.tfm \
tex-nanumgtbo6e.tfm \
tex-nanumgtbo6f.tfm \
tex-nanumgtbo70.tfm \
tex-nanumgtbo71.tfm \
tex-nanumgtbo72.tfm \
tex-nanumgtbo73.tfm \
tex-nanumgtbo74.tfm \
tex-nanumgtbo75.tfm \
tex-nanumgtbo76.tfm \
tex-nanumgtbo77.tfm \
tex-nanumgtbo78.tfm \
tex-nanumgtbo79.tfm \
tex-nanumgtbo7a.tfm \
tex-nanumgtbo7b.tfm \
tex-nanumgtbo7c.tfm \
tex-nanumgtbo7d.tfm \
tex-nanumgtbo7e.tfm \
tex-nanumgtbo7f.tfm \
tex-nanumgtbo80.tfm \
tex-nanumgtbo81.tfm \
tex-nanumgtbo82.tfm \
tex-nanumgtbo83.tfm \
tex-nanumgtbo84.tfm \
tex-nanumgtbo85.tfm \
tex-nanumgtbo86.tfm \
tex-nanumgtbo87.tfm \
tex-nanumgtbo88.tfm \
tex-nanumgtbo89.tfm \
tex-nanumgtbo8a.tfm \
tex-nanumgtbo8b.tfm \
tex-nanumgtbo8c.tfm \
tex-nanumgtbo8d.tfm \
tex-nanumgtbo8e.tfm \
tex-nanumgtbo8f.tfm \
tex-nanumgtbo90.tfm \
tex-nanumgtbo91.tfm \
tex-nanumgtbo92.tfm \
tex-nanumgtbo93.tfm \
tex-nanumgtbo94.tfm \
tex-nanumgtbo95.tfm \
tex-nanumgtbo96.tfm \
tex-nanumgtbo97.tfm \
tex-nanumgtbo98.tfm \
tex-nanumgtbo99.tfm \
tex-nanumgtbo9a.tfm \
tex-nanumgtbo9b.tfm \
tex-nanumgtbo9c.tfm \
tex-nanumgtbo9d.tfm \
tex-nanumgtbo9e.tfm \
tex-nanumgtbo9f.tfm \
tex-nanumgtboac.tfm \
tex-nanumgtboad.tfm \
tex-nanumgtboae.tfm \
tex-nanumgtboaf.tfm \
tex-nanumgtbob0.tfm \
tex-nanumgtbob1.tfm \
tex-nanumgtbob2.tfm \
tex-nanumgtbob3.tfm \
tex-nanumgtbob4.tfm \
tex-nanumgtbob5.tfm \
tex-nanumgtbob6.tfm \
tex-nanumgtbob7.tfm \
tex-nanumgtbob8.tfm \
tex-nanumgtbob9.tfm \
tex-nanumgtboba.tfm \
tex-nanumgtbobb.tfm \
tex-nanumgtbobc.tfm \
tex-nanumgtbobd.tfm \
tex-nanumgtbobe.tfm \
tex-nanumgtbobf.tfm \
tex-nanumgtboc0.tfm \
tex-nanumgtboc1.tfm \
tex-nanumgtboc2.tfm \
tex-nanumgtboc3.tfm \
tex-nanumgtboc4.tfm \
tex-nanumgtboc5.tfm \
tex-nanumgtboc6.tfm \
tex-nanumgtboc7.tfm \
tex-nanumgtboc8.tfm \
tex-nanumgtboc9.tfm \
tex-nanumgtboca.tfm \
tex-nanumgtbocb.tfm \
tex-nanumgtbocc.tfm \
tex-nanumgtbocd.tfm \
tex-nanumgtboce.tfm \
tex-nanumgtbocf.tfm \
tex-nanumgtbod0.tfm \
tex-nanumgtbod1.tfm \
tex-nanumgtbod2.tfm \
tex-nanumgtbod3.tfm \
tex-nanumgtbod4.tfm \
tex-nanumgtbod5.tfm \
tex-nanumgtbod6.tfm \
tex-nanumgtbod7.tfm \
tex-nanumgtbof9.tfm \
tex-nanumgtbofa.tfm \
tex-nanumgtboff.tfm \
tex-nanumgtm00.tfm \
tex-nanumgtm01.tfm \
tex-nanumgtm02.tfm \
tex-nanumgtm03.tfm \
tex-nanumgtm04.tfm \
tex-nanumgtm11.tfm \
tex-nanumgtm20.tfm \
tex-nanumgtm21.tfm \
tex-nanumgtm22.tfm \
tex-nanumgtm23.tfm \
tex-nanumgtm24.tfm \
tex-nanumgtm25.tfm \
tex-nanumgtm26.tfm \
tex-nanumgtm27.tfm \
tex-nanumgtm2a.tfm \
tex-nanumgtm30.tfm \
tex-nanumgtm31.tfm \
tex-nanumgtm32.tfm \
tex-nanumgtm33.tfm \
tex-nanumgtm4e.tfm \
tex-nanumgtm4f.tfm \
tex-nanumgtm50.tfm \
tex-nanumgtm51.tfm \
tex-nanumgtm52.tfm \
tex-nanumgtm53.tfm \
tex-nanumgtm54.tfm \
tex-nanumgtm55.tfm \
tex-nanumgtm56.tfm \
tex-nanumgtm57.tfm \
tex-nanumgtm58.tfm \
tex-nanumgtm59.tfm \
tex-nanumgtm5a.tfm \
tex-nanumgtm5b.tfm \
tex-nanumgtm5c.tfm \
tex-nanumgtm5d.tfm \
tex-nanumgtm5e.tfm \
tex-nanumgtm5f.tfm \
tex-nanumgtm60.tfm \
tex-nanumgtm61.tfm \
tex-nanumgtm62.tfm \
tex-nanumgtm63.tfm \
tex-nanumgtm64.tfm \
tex-nanumgtm65.tfm \
tex-nanumgtm66.tfm \
tex-nanumgtm67.tfm \
tex-nanumgtm68.tfm \
tex-nanumgtm69.tfm \
tex-nanumgtm6a.tfm \
tex-nanumgtm6b.tfm \
tex-nanumgtm6c.tfm \
tex-nanumgtm6d.tfm \
tex-nanumgtm6e.tfm \
tex-nanumgtm6f.tfm \
tex-nanumgtm70.tfm \
tex-nanumgtm71.tfm \
tex-nanumgtm72.tfm \
tex-nanumgtm73.tfm \
tex-nanumgtm74.tfm \
tex-nanumgtm75.tfm \
tex-nanumgtm76.tfm \
tex-nanumgtm77.tfm \
tex-nanumgtm78.tfm \
tex-nanumgtm79.tfm \
tex-nanumgtm7a.tfm \
tex-nanumgtm7b.tfm \
tex-nanumgtm7c.tfm \
tex-nanumgtm7d.tfm \
tex-nanumgtm7e.tfm \
tex-nanumgtm7f.tfm \
tex-nanumgtm80.tfm \
tex-nanumgtm81.tfm \
tex-nanumgtm82.tfm \
tex-nanumgtm83.tfm \
tex-nanumgtm84.tfm \
tex-nanumgtm85.tfm \
tex-nanumgtm86.tfm \
tex-nanumgtm87.tfm \
tex-nanumgtm88.tfm \
tex-nanumgtm89.tfm \
tex-nanumgtm8a.tfm \
tex-nanumgtm8b.tfm \
tex-nanumgtm8c.tfm \
tex-nanumgtm8d.tfm \
tex-nanumgtm8e.tfm \
tex-nanumgtm8f.tfm \
tex-nanumgtm90.tfm \
tex-nanumgtm91.tfm \
tex-nanumgtm92.tfm \
tex-nanumgtm93.tfm \
tex-nanumgtm94.tfm \
tex-nanumgtm95.tfm \
tex-nanumgtm96.tfm \
tex-nanumgtm97.tfm \
tex-nanumgtm98.tfm \
tex-nanumgtm99.tfm \
tex-nanumgtm9a.tfm \
tex-nanumgtm9b.tfm \
tex-nanumgtm9c.tfm \
tex-nanumgtm9d.tfm \
tex-nanumgtm9e.tfm \
tex-nanumgtm9f.tfm \
tex-nanumgtmac.tfm \
tex-nanumgtmad.tfm \
tex-nanumgtmae.tfm \
tex-nanumgtmaf.tfm \
tex-nanumgtmb0.tfm \
tex-nanumgtmb1.tfm \
tex-nanumgtmb2.tfm \
tex-nanumgtmb3.tfm \
tex-nanumgtmb4.tfm \
tex-nanumgtmb5.tfm \
tex-nanumgtmb6.tfm \
tex-nanumgtmb7.tfm \
tex-nanumgtmb8.tfm \
tex-nanumgtmb9.tfm \
tex-nanumgtmba.tfm \
tex-nanumgtmbb.tfm \
tex-nanumgtmbc.tfm \
tex-nanumgtmbd.tfm \
tex-nanumgtmbe.tfm \
tex-nanumgtmbf.tfm \
tex-nanumgtmc0.tfm \
tex-nanumgtmc1.tfm \
tex-nanumgtmc2.tfm \
tex-nanumgtmc3.tfm \
tex-nanumgtmc4.tfm \
tex-nanumgtmc5.tfm \
tex-nanumgtmc6.tfm \
tex-nanumgtmc7.tfm \
tex-nanumgtmc8.tfm \
tex-nanumgtmc9.tfm \
tex-nanumgtmca.tfm \
tex-nanumgtmcb.tfm \
tex-nanumgtmcc.tfm \
tex-nanumgtmcd.tfm \
tex-nanumgtmce.tfm \
tex-nanumgtmcf.tfm \
tex-nanumgtmd0.tfm \
tex-nanumgtmd1.tfm \
tex-nanumgtmd2.tfm \
tex-nanumgtmd3.tfm \
tex-nanumgtmd4.tfm \
tex-nanumgtmd5.tfm \
tex-nanumgtmd6.tfm \
tex-nanumgtmd7.tfm \
tex-nanumgtmf9.tfm \
tex-nanumgtmfa.tfm \
tex-nanumgtmff.tfm \
tex-nanumgtmo00.tfm \
tex-nanumgtmo01.tfm \
tex-nanumgtmo02.tfm \
tex-nanumgtmo03.tfm \
tex-nanumgtmo04.tfm \
tex-nanumgtmo11.tfm \
tex-nanumgtmo20.tfm \
tex-nanumgtmo21.tfm \
tex-nanumgtmo22.tfm \
tex-nanumgtmo23.tfm \
tex-nanumgtmo24.tfm \
tex-nanumgtmo25.tfm \
tex-nanumgtmo26.tfm \
tex-nanumgtmo27.tfm \
tex-nanumgtmo2a.tfm \
tex-nanumgtmo30.tfm \
tex-nanumgtmo31.tfm \
tex-nanumgtmo32.tfm \
tex-nanumgtmo33.tfm \
tex-nanumgtmo4e.tfm \
tex-nanumgtmo4f.tfm \
tex-nanumgtmo50.tfm \
tex-nanumgtmo51.tfm \
tex-nanumgtmo52.tfm \
tex-nanumgtmo53.tfm \
tex-nanumgtmo54.tfm \
tex-nanumgtmo55.tfm \
tex-nanumgtmo56.tfm \
tex-nanumgtmo57.tfm \
tex-nanumgtmo58.tfm \
tex-nanumgtmo59.tfm \
tex-nanumgtmo5a.tfm \
tex-nanumgtmo5b.tfm \
tex-nanumgtmo5c.tfm \
tex-nanumgtmo5d.tfm \
tex-nanumgtmo5e.tfm \
tex-nanumgtmo5f.tfm \
tex-nanumgtmo60.tfm \
tex-nanumgtmo61.tfm \
tex-nanumgtmo62.tfm \
tex-nanumgtmo63.tfm \
tex-nanumgtmo64.tfm \
tex-nanumgtmo65.tfm \
tex-nanumgtmo66.tfm \
tex-nanumgtmo67.tfm \
tex-nanumgtmo68.tfm \
tex-nanumgtmo69.tfm \
tex-nanumgtmo6a.tfm \
tex-nanumgtmo6b.tfm \
tex-nanumgtmo6c.tfm \
tex-nanumgtmo6d.tfm \
tex-nanumgtmo6e.tfm \
tex-nanumgtmo6f.tfm \
tex-nanumgtmo70.tfm \
tex-nanumgtmo71.tfm \
tex-nanumgtmo72.tfm \
tex-nanumgtmo73.tfm \
tex-nanumgtmo74.tfm \
tex-nanumgtmo75.tfm \
tex-nanumgtmo76.tfm \
tex-nanumgtmo77.tfm \
tex-nanumgtmo78.tfm \
tex-nanumgtmo79.tfm \
tex-nanumgtmo7a.tfm \
tex-nanumgtmo7b.tfm \
tex-nanumgtmo7c.tfm \
tex-nanumgtmo7d.tfm \
tex-nanumgtmo7e.tfm \
tex-nanumgtmo7f.tfm \
tex-nanumgtmo80.tfm \
tex-nanumgtmo81.tfm \
tex-nanumgtmo82.tfm \
tex-nanumgtmo83.tfm \
tex-nanumgtmo84.tfm \
tex-nanumgtmo85.tfm \
tex-nanumgtmo86.tfm \
tex-nanumgtmo87.tfm \
tex-nanumgtmo88.tfm \
tex-nanumgtmo89.tfm \
tex-nanumgtmo8a.tfm \
tex-nanumgtmo8b.tfm \
tex-nanumgtmo8c.tfm \
tex-nanumgtmo8d.tfm \
tex-nanumgtmo8e.tfm \
tex-nanumgtmo8f.tfm \
tex-nanumgtmo90.tfm \
tex-nanumgtmo91.tfm \
tex-nanumgtmo92.tfm \
tex-nanumgtmo93.tfm \
tex-nanumgtmo94.tfm \
tex-nanumgtmo95.tfm \
tex-nanumgtmo96.tfm \
tex-nanumgtmo97.tfm \
tex-nanumgtmo98.tfm \
tex-nanumgtmo99.tfm \
tex-nanumgtmo9a.tfm \
tex-nanumgtmo9b.tfm \
tex-nanumgtmo9c.tfm \
tex-nanumgtmo9d.tfm \
tex-nanumgtmo9e.tfm \
tex-nanumgtmo9f.tfm \
tex-nanumgtmoac.tfm \
tex-nanumgtmoad.tfm \
tex-nanumgtmoae.tfm \
tex-nanumgtmoaf.tfm \
tex-nanumgtmob0.tfm \
tex-nanumgtmob1.tfm \
tex-nanumgtmob2.tfm \
tex-nanumgtmob3.tfm \
tex-nanumgtmob4.tfm \
tex-nanumgtmob5.tfm \
tex-nanumgtmob6.tfm \
tex-nanumgtmob7.tfm \
tex-nanumgtmob8.tfm \
tex-nanumgtmob9.tfm \
tex-nanumgtmoba.tfm \
tex-nanumgtmobb.tfm \
tex-nanumgtmobc.tfm \
tex-nanumgtmobd.tfm \
tex-nanumgtmobe.tfm \
tex-nanumgtmobf.tfm \
tex-nanumgtmoc0.tfm \
tex-nanumgtmoc1.tfm \
tex-nanumgtmoc2.tfm \
tex-nanumgtmoc3.tfm \
tex-nanumgtmoc4.tfm \
tex-nanumgtmoc5.tfm \
tex-nanumgtmoc6.tfm \
tex-nanumgtmoc7.tfm \
tex-nanumgtmoc8.tfm \
tex-nanumgtmoc9.tfm \
tex-nanumgtmoca.tfm \
tex-nanumgtmocb.tfm \
tex-nanumgtmocc.tfm \
tex-nanumgtmocd.tfm \
tex-nanumgtmoce.tfm \
tex-nanumgtmocf.tfm \
tex-nanumgtmod0.tfm \
tex-nanumgtmod1.tfm \
tex-nanumgtmod2.tfm \
tex-nanumgtmod3.tfm \
tex-nanumgtmod4.tfm \
tex-nanumgtmod5.tfm \
tex-nanumgtmod6.tfm \
tex-nanumgtmod7.tfm \
tex-nanumgtmof9.tfm \
tex-nanumgtmofa.tfm \
tex-nanumgtmoff.tfm \
tex-nanummjb00.tfm \
tex-nanummjb01.tfm \
tex-nanummjb02.tfm \
tex-nanummjb03.tfm \
tex-nanummjb04.tfm \
tex-nanummjb20.tfm \
tex-nanummjb21.tfm \
tex-nanummjb22.tfm \
tex-nanummjb23.tfm \
tex-nanummjb24.tfm \
tex-nanummjb25.tfm \
tex-nanummjb26.tfm \
tex-nanummjb27.tfm \
tex-nanummjb2a.tfm \
tex-nanummjb30.tfm \
tex-nanummjb31.tfm \
tex-nanummjb32.tfm \
tex-nanummjb33.tfm \
tex-nanummjbac.tfm \
tex-nanummjbad.tfm \
tex-nanummjbae.tfm \
tex-nanummjbaf.tfm \
tex-nanummjbb0.tfm \
tex-nanummjbb1.tfm \
tex-nanummjbb2.tfm \
tex-nanummjbb3.tfm \
tex-nanummjbb4.tfm \
tex-nanummjbb5.tfm \
tex-nanummjbb6.tfm \
tex-nanummjbb7.tfm \
tex-nanummjbb8.tfm \
tex-nanummjbb9.tfm \
tex-nanummjbba.tfm \
tex-nanummjbbb.tfm \
tex-nanummjbbc.tfm \
tex-nanummjbbd.tfm \
tex-nanummjbbe.tfm \
tex-nanummjbbf.tfm \
tex-nanummjbc0.tfm \
tex-nanummjbc1.tfm \
tex-nanummjbc2.tfm \
tex-nanummjbc3.tfm \
tex-nanummjbc4.tfm \
tex-nanummjbc5.tfm \
tex-nanummjbc6.tfm \
tex-nanummjbc7.tfm \
tex-nanummjbc8.tfm \
tex-nanummjbc9.tfm \
tex-nanummjbca.tfm \
tex-nanummjbcb.tfm \
tex-nanummjbcc.tfm \
tex-nanummjbcd.tfm \
tex-nanummjbce.tfm \
tex-nanummjbcf.tfm \
tex-nanummjbd0.tfm \
tex-nanummjbd1.tfm \
tex-nanummjbd2.tfm \
tex-nanummjbd3.tfm \
tex-nanummjbd4.tfm \
tex-nanummjbd5.tfm \
tex-nanummjbd6.tfm \
tex-nanummjbd7.tfm \
tex-nanummjbff.tfm \
tex-nanummjbo00.tfm \
tex-nanummjbo01.tfm \
tex-nanummjbo02.tfm \
tex-nanummjbo03.tfm \
tex-nanummjbo04.tfm \
tex-nanummjbo20.tfm \
tex-nanummjbo21.tfm \
tex-nanummjbo22.tfm \
tex-nanummjbo23.tfm \
tex-nanummjbo24.tfm \
tex-nanummjbo25.tfm \
tex-nanummjbo26.tfm \
tex-nanummjbo27.tfm \
tex-nanummjbo2a.tfm \
tex-nanummjbo30.tfm \
tex-nanummjbo31.tfm \
tex-nanummjbo32.tfm \
tex-nanummjbo33.tfm \
tex-nanummjboac.tfm \
tex-nanummjboad.tfm \
tex-nanummjboae.tfm \
tex-nanummjboaf.tfm \
tex-nanummjbob0.tfm \
tex-nanummjbob1.tfm \
tex-nanummjbob2.tfm \
tex-nanummjbob3.tfm \
tex-nanummjbob4.tfm \
tex-nanummjbob5.tfm \
tex-nanummjbob6.tfm \
tex-nanummjbob7.tfm \
tex-nanummjbob8.tfm \
tex-nanummjbob9.tfm \
tex-nanummjboba.tfm \
tex-nanummjbobb.tfm \
tex-nanummjbobc.tfm \
tex-nanummjbobd.tfm \
tex-nanummjbobe.tfm \
tex-nanummjbobf.tfm \
tex-nanummjboc0.tfm \
tex-nanummjboc1.tfm \
tex-nanummjboc2.tfm \
tex-nanummjboc3.tfm \
tex-nanummjboc4.tfm \
tex-nanummjboc5.tfm \
tex-nanummjboc6.tfm \
tex-nanummjboc7.tfm \
tex-nanummjboc8.tfm \
tex-nanummjboc9.tfm \
tex-nanummjboca.tfm \
tex-nanummjbocb.tfm \
tex-nanummjbocc.tfm \
tex-nanummjbocd.tfm \
tex-nanummjboce.tfm \
tex-nanummjbocf.tfm \
tex-nanummjbod0.tfm \
tex-nanummjbod1.tfm \
tex-nanummjbod2.tfm \
tex-nanummjbod3.tfm \
tex-nanummjbod4.tfm \
tex-nanummjbod5.tfm \
tex-nanummjbod6.tfm \
tex-nanummjbod7.tfm \
tex-nanummjboff.tfm \
tex-nanummjm00.tfm \
tex-nanummjm01.tfm \
tex-nanummjm02.tfm \
tex-nanummjm03.tfm \
tex-nanummjm04.tfm \
tex-nanummjm20.tfm \
tex-nanummjm21.tfm \
tex-nanummjm22.tfm \
tex-nanummjm23.tfm \
tex-nanummjm24.tfm \
tex-nanummjm25.tfm \
tex-nanummjm26.tfm \
tex-nanummjm27.tfm \
tex-nanummjm30.tfm \
tex-nanummjm31.tfm \
tex-nanummjm32.tfm \
tex-nanummjm33.tfm \
tex-nanummjmac.tfm \
tex-nanummjmad.tfm \
tex-nanummjmae.tfm \
tex-nanummjmaf.tfm \
tex-nanummjmb0.tfm \
tex-nanummjmb1.tfm \
tex-nanummjmb2.tfm \
tex-nanummjmb3.tfm \
tex-nanummjmb4.tfm \
tex-nanummjmb5.tfm \
tex-nanummjmb6.tfm \
tex-nanummjmb7.tfm \
tex-nanummjmb8.tfm \
tex-nanummjmb9.tfm \
tex-nanummjmba.tfm \
tex-nanummjmbb.tfm \
tex-nanummjmbc.tfm \
tex-nanummjmbd.tfm \
tex-nanummjmbe.tfm \
tex-nanummjmbf.tfm \
tex-nanummjmc0.tfm \
tex-nanummjmc1.tfm \
tex-nanummjmc2.tfm \
tex-nanummjmc3.tfm \
tex-nanummjmc4.tfm \
tex-nanummjmc5.tfm \
tex-nanummjmc6.tfm \
tex-nanummjmc7.tfm \
tex-nanummjmc8.tfm \
tex-nanummjmc9.tfm \
tex-nanummjmca.tfm \
tex-nanummjmcb.tfm \
tex-nanummjmcc.tfm \
tex-nanummjmcd.tfm \
tex-nanummjmce.tfm \
tex-nanummjmcf.tfm \
tex-nanummjmd0.tfm \
tex-nanummjmd1.tfm \
tex-nanummjmd2.tfm \
tex-nanummjmd3.tfm \
tex-nanummjmd4.tfm \
tex-nanummjmd5.tfm \
tex-nanummjmd6.tfm \
tex-nanummjmd7.tfm \
tex-nanummjmff.tfm \
tex-nanummjmo00.tfm \
tex-nanummjmo01.tfm \
tex-nanummjmo02.tfm \
tex-nanummjmo03.tfm \
tex-nanummjmo04.tfm \
tex-nanummjmo20.tfm \
tex-nanummjmo21.tfm \
tex-nanummjmo22.tfm \
tex-nanummjmo23.tfm \
tex-nanummjmo24.tfm \
tex-nanummjmo25.tfm \
tex-nanummjmo26.tfm \
tex-nanummjmo27.tfm \
tex-nanummjmo30.tfm \
tex-nanummjmo31.tfm \
tex-nanummjmo32.tfm \
tex-nanummjmo33.tfm \
tex-nanummjmoac.tfm \
tex-nanummjmoad.tfm \
tex-nanummjmoae.tfm \
tex-nanummjmoaf.tfm \
tex-nanummjmob0.tfm \
tex-nanummjmob1.tfm \
tex-nanummjmob2.tfm \
tex-nanummjmob3.tfm \
tex-nanummjmob4.tfm \
tex-nanummjmob5.tfm \
tex-nanummjmob6.tfm \
tex-nanummjmob7.tfm \
tex-nanummjmob8.tfm \
tex-nanummjmob9.tfm \
tex-nanummjmoba.tfm \
tex-nanummjmobb.tfm \
tex-nanummjmobc.tfm \
tex-nanummjmobd.tfm \
tex-nanummjmobe.tfm \
tex-nanummjmobf.tfm \
tex-nanummjmoc0.tfm \
tex-nanummjmoc1.tfm \
tex-nanummjmoc2.tfm \
tex-nanummjmoc3.tfm \
tex-nanummjmoc4.tfm \
tex-nanummjmoc5.tfm \
tex-nanummjmoc6.tfm \
tex-nanummjmoc7.tfm \
tex-nanummjmoc8.tfm \
tex-nanummjmoc9.tfm \
tex-nanummjmoca.tfm \
tex-nanummjmocb.tfm \
tex-nanummjmocc.tfm \
tex-nanummjmocd.tfm \
tex-nanummjmoce.tfm \
tex-nanummjmocf.tfm \
tex-nanummjmod0.tfm \
tex-nanummjmod1.tfm \
tex-nanummjmod2.tfm \
tex-nanummjmod3.tfm \
tex-nanummjmod4.tfm \
tex-nanummjmod5.tfm \
tex-nanummjmod6.tfm \
tex-nanummjmod7.tfm \
tex-nanummjmoff.tfm \
tex-t1nanumgt.fd \
tex-t1nanumgtb.tfm \
tex-t1nanumgtbo.tfm \
tex-t1nanumgtm.tfm \
tex-t1nanumgtmo.tfm \
tex-t1nanummj.fd \
tex-t1nanummjb.tfm \
tex-t1nanummjbo.tfm \
tex-t1nanummjm.tfm \
tex-t1nanummjmo.tfm \
tex-ts1nanumgt.fd \
tex-ts1nanumgtb.tfm \
tex-ts1nanumgtb.vf \
tex-ts1nanumgtbo.tfm \
tex-ts1nanumgtbo.vf \
tex-ts1nanumgtm.tfm \
tex-ts1nanumgtm.vf \
tex-ts1nanumgtmo.tfm \
tex-ts1nanumgtmo.vf \
tex-ts1nanummj.fd \
tex-ts1nanummjb.tfm \
tex-ts1nanummjb.vf \
tex-ts1nanummjbo.tfm \
tex-ts1nanummjbo.vf \
tex-ts1nanummjm.tfm \
tex-ts1nanummjm.vf \
tex-ts1nanummjmo.tfm \
tex-ts1nanummjmo.vf \
texlive-nanumtype1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-nanumtype1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
