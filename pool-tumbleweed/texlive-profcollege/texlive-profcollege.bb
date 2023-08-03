SUMMARY = "A LaTeX package for French maths teachers in college"
DESCRIPTION = "This package provides some commands to help French mathematics \
teachers for 11-16 years olds, for example: \\Tableau[Metre] to \
write the tabular km|hm|... with some facilities, \
\\Pythagore{ABC}{5}{7} to write the entire calculation of AC \
with the Pythagorean theorem, \\Trigo[Cosinus]{ABC}{3}{}{60} to \
write the entire calculation of AC with cosine, ... and some \
others."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99_z_fsvn66364"

RPM_NAME = "texlive-profcollege-2023.209.0.0.99_z_fsvn66364-53.1.noarch.rpm"
RPM_HASH = "53f680df280d2c3a9de4d5ae7ce120a3af6b50bd46cb6c5339a0a209079ec1066264f0a7bc697de013dff58d8dfed01845efa727032eabb208813e03b10c1aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PfCCafrique.dat \
tex-PfCCameriquecentrale.dat \
tex-PfCCameriquenord.dat \
tex-PfCCameriquesud.dat \
tex-PfCCasia.dat \
tex-PfCCasie.dat \
tex-PfCCcaraibes.dat \
tex-PfCCeurope.dat \
tex-PfCEquationComposition2.tex \
tex-PfCEquationLaurent1.tex \
tex-PfCEquationPose1.tex \
tex-PfCEquationSoustraction2.tex \
tex-PfCEquationSymbole1.tex \
tex-PfCEquationTerme1.tex \
tex-PfCIle.dat \
tex-PfCafganistan.dat \
tex-PfCafriquesud1.dat \
tex-PfCafriquesud2.dat \
tex-PfCalbanie.dat \
tex-PfCalgerie.dat \
tex-PfCallemagne1.dat \
tex-PfCallemagne2.dat \
tex-PfCandorre.dat \
tex-PfCangleterre.dat \
tex-PfCangola.dat \
tex-PfCarabiesaoudite.dat \
tex-PfCargentine1.dat \
tex-PfCargentine2.dat \
tex-PfCarmenie.dat \
tex-PfCautriche.dat \
tex-PfCazerbaijan1.dat \
tex-PfCazerbaijan2.dat \
tex-PfCbangladesh.dat \
tex-PfCbelarussie.dat \
tex-PfCbelgique.dat \
tex-PfCbelize.dat \
tex-PfCbenin.dat \
tex-PfCbhutan.dat \
tex-PfCbirmanie.dat \
tex-PfCbolivie1.dat \
tex-PfCbolivie2.dat \
tex-PfCbosnie1.dat \
tex-PfCbosnie2.dat \
tex-PfCbotswana.dat \
tex-PfCbresil.dat \
tex-PfCbrunei.dat \
tex-PfCbulgarie.dat \
tex-PfCburkinafaso.dat \
tex-PfCburundi.dat \
tex-PfCcabinda.dat \
tex-PfCcambodge.dat \
tex-PfCcameroun.dat \
tex-PfCcanada.dat \
tex-PfCcapitales.dat \
tex-PfCchili1.dat \
tex-PfCchili2.dat \
tex-PfCchine.dat \
tex-PfCcolombie.dat \
tex-PfCcongo.dat \
tex-PfCcoreenord.dat \
tex-PfCcoreesud.dat \
tex-PfCcostarica.dat \
tex-PfCcoteivoire.dat \
tex-PfCcroatie.dat \
tex-PfCdanemark.dat \
tex-PfCdjibouti.dat \
tex-PfCecosse.dat \
tex-PfCegypte.dat \
tex-PfCemirats.dat \
tex-PfCequateur.dat \
tex-PfCeritre.dat \
tex-PfCespagne.dat \
tex-PfCestonie.dat \
tex-PfCethiopie.dat \
tex-PfCfinlande.dat \
tex-PfCfleuveseurope.dat \
tex-PfCfleuvessup.dat \
tex-PfCfrance.dat \
tex-PfCgabon.dat \
tex-PfCgambie.dat \
tex-PfCgaza.dat \
tex-PfCgeorgie.dat \
tex-PfCghana.dat \
tex-PfCgibraltar.dat \
tex-PfCgrece.dat \
tex-PfCguatemala.dat \
tex-PfCguinee.dat \
tex-PfCguineebissau.dat \
tex-PfCguineef.dat \
tex-PfCguyane.dat \
tex-PfChaiti.dat \
tex-PfChonduras.dat \
tex-PfChongrie.dat \
tex-PfCiles.dat \
tex-PfCiles1.dat \
tex-PfCinde.dat \
tex-PfCindonesie1.dat \
tex-PfCindonesie2.dat \
tex-PfCirak.dat \
tex-PfCiran.dat \
tex-PfCirelande.dat \
tex-PfCirelandenord.dat \
tex-PfCisrael.dat \
tex-PfCitalie.dat \
tex-PfCjordanie.dat \
tex-PfCkazakhstan.dat \
tex-PfCkenya.dat \
tex-PfCkoweit.dat \
tex-PfCkyrgyzstan.dat \
tex-PfClacs.dat \
tex-PfClacssup.dat \
tex-PfClaos.dat \
tex-PfClesotho.dat \
tex-PfClettonie.dat \
tex-PfCliban.dat \
tex-PfCliberia.dat \
tex-PfClibye.dat \
tex-PfCliechtenstein.dat \
tex-PfClithuanie1.dat \
tex-PfClithuanie2.dat \
tex-PfCluxembourg.dat \
tex-PfCmacedoine.dat \
tex-PfCmalaisie1.dat \
tex-PfCmalaisie2.dat \
tex-PfCmalawi.dat \
tex-PfCmali.dat \
tex-PfCmaroc.dat \
tex-PfCmauritanie.dat \
tex-PfCmexique.dat \
tex-PfCmoldavie.dat \
tex-PfCmonaco.dat \
tex-PfCmongolie.dat \
tex-PfCmozambique.dat \
tex-PfCnamibie.dat \
tex-PfCnepal.dat \
tex-PfCnicaragua.dat \
tex-PfCniger.dat \
tex-PfCnigeria.dat \
tex-PfCnorvege.dat \
tex-PfCnvelleguinne.dat \
tex-PfComan1.dat \
tex-PfComan2.dat \
tex-PfCouganda.dat \
tex-PfCouzbekistan.dat \
tex-PfCpakistan.dat \
tex-PfCpanama1.dat \
tex-PfCpanama2.dat \
tex-PfCparaguay.dat \
tex-PfCpaysbas.dat \
tex-PfCpaysdegalles.dat \
tex-PfCperou.dat \
tex-PfCpolesud.dat \
tex-PfCpologne.dat \
tex-PfCportugal.dat \
tex-PfCquatar.dat \
tex-PfCrepcentreafrique.dat \
tex-PfCrepdominicaine.dat \
tex-PfCriomuni.dat \
tex-PfCrivieres.dat \
tex-PfCroumanie.dat \
tex-PfCrussie1.dat \
tex-PfCrussie1bis.dat \
tex-PfCrussie2.dat \
tex-PfCrussie3.dat \
tex-PfCrussie3bis.dat \
tex-PfCrwanda.dat \
tex-PfCsaharaouest.dat \
tex-PfCsalvador.dat \
tex-PfCsanmarin.dat \
tex-PfCsenegal.dat \
tex-PfCsierraleone.dat \
tex-PfCslovaquie.dat \
tex-PfCslovenie.dat \
tex-PfCsomalie.dat \
tex-PfCsoudan.dat \
tex-PfCsuede.dat \
tex-PfCsuisse.dat \
tex-PfCsurinam.dat \
tex-PfCswaziland.dat \
tex-PfCsyrie.dat \
tex-PfCtajikistan.dat \
tex-PfCtanzanie.dat \
tex-PfCtchad.dat \
tex-PfCtcheque.dat \
tex-PfCthailande.dat \
tex-PfCtogo.dat \
tex-PfCtunisie.dat \
tex-PfCturkmenistan.dat \
tex-PfCturquie1.dat \
tex-PfCturquie2.dat \
tex-PfCukraine.dat \
tex-PfCuruguay.dat \
tex-PfCusa1.dat \
tex-PfCusa2.dat \
tex-PfCvenezuela.dat \
tex-PfCvietnam.dat \
tex-PfCvillesFrance.dat \
tex-PfCvillesFranceCycle4.dat \
tex-PfCvillesFranceNord.dat \
tex-PfCvillesFrancesimp.dat \
tex-PfCvillesItalie.dat \
tex-PfCvolcans.dat \
tex-PfCwestbank.dat \
tex-PfCyemen.dat \
tex-PfCyougoslavie.dat \
tex-PfCzaire.dat \
tex-PfCzambie.dat \
tex-PfCzimbabwe.dat \
tex-ProfCollege.sty \
texlive-profcollege"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-cancel.sty \
tex-datatool.sty \
tex-environ.sty \
tex-fmtcount.sty \
tex-fontawesome5.sty \
tex-gmp.sty \
tex-hhline.sty \
tex-ifoddpage.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-longtable.sty \
tex-luacas.sty \
tex-luamplib.sty \
tex-mathtools.sty \
tex-modulus.sty \
tex-multicol.sty \
tex-multido.sty \
tex-nicematrix.sty \
tex-pifont.sty \
tex-printlen.sty \
tex-simplekv.sty \
tex-siunitx.sty \
tex-stackengine.sty \
tex-suffix.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xlop.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
