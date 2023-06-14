SUMMARY = "Mongolian LaTeX"
DESCRIPTION = "MonTeX provides Mongolian and Manju support for the TeX/LaTeX \
community. Mongolian is a language spoken in North East Asia, \
namely Mongolia and the Inner Mongol Autonomous Region of \
China. Today, it is written in an extended Cyrillic alphabet in \
Mongolia whereas the Uighur writing continues to be in use in \
Inner Mongolia, though it is also, legally speaking, the \
official writing system of Mongolia. Manju is another language \
of North East Asia, belonging to the Tungusic branch of the \
Altaic languages. Though it is hardly spoken nowadays, it \
survives in written form as Manju was the native language of \
the rulers of the Qing dynasty (1644-1911) in China. Large \
quantities of documents of the Imperial Archives survive, as \
well as some of the finest dictionaries ever compiled in Asia, \
like the Pentaglot, a dictionary comprising Manju, Tibetan, \
Mongolian, Uighur and Chinese. MonTeX provides all necessary \
characters for writing standard Mongolian in Cyrillic and \
Classical (aka Traditional or Uighur) writing, and Manju as \
well as transliterated Tibetan texts, for which purpose a \
number of additional characters was created. In MonTeX, both \
Mongolian and Manju are entered in romanized form. The \
retransliteration (from Latin input to Mongolian and Manju \
output) is completely realized in TeX/Metafont so that no \
external preprocessor is required. Please note that most of the \
enhanced functions of MonTeX require a working e-LaTeX \
environment. This is especially true when compiling documents \
with Mongolian or Manju as the main document language. It is \
recommended to choose pdfelatex as the resulting PDF files are \
truly portable. Vertical text generated by MonTeX is not \
supported in DVI."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.ivu.04.092svn29349"

RPM_NAME = "texlive-montex-2023.201.ivu.04.092svn29349-54.1.noarch.rpm"
RPM_HASH = "c9ee602c7065b6e7b1aba60a1e82c2eee66fa31d8507762ce2cfc3b40eedd799e4d506f1395148377a03cfbb1a8ad80ea50f14108d6b5fa693bd094e0a91c2e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bcghsb.tfm \
tex-bcghsm.tfm \
tex-bcghwb.tfm \
tex-bcghwm.tfm \
tex-bcgvsb.tfm \
tex-bcgvsm.tfm \
tex-bcgvwb.tfm \
tex-bcgvwm.tfm \
tex-bicig.def \
tex-bicighb.tfm \
tex-bicighm.tfm \
tex-bicigvb.tfm \
tex-bicigvm.tfm \
tex-bithe.def \
tex-bthhsb.tfm \
tex-bthhsm.tfm \
tex-bthhwb.tfm \
tex-bthhwm.tfm \
tex-bthvsb.tfm \
tex-bthvsm.tfm \
tex-bthvwb.tfm \
tex-bthvwm.tfm \
tex-buryat.def \
tex-bxghsb.tfm \
tex-bxghsm.tfm \
tex-bxghwb.tfm \
tex-bxghwm.tfm \
tex-bxgvsb.tfm \
tex-bxgvsm.tfm \
tex-bxgvwb.tfm \
tex-bxgvwm.tfm \
tex-cpctt.def \
tex-cpdbk.def \
tex-cpibmrus.def \
tex-cpkoi.def \
tex-cpmls.def \
tex-cpmnk.def \
tex-cpmos.def \
tex-cpncc.def \
tex-english.def \
tex-kazakh.def \
tex-kmb10.tfm \
tex-kmbx10.tfm \
tex-kmbx12.tfm \
tex-kmbx5.tfm \
tex-kmbx6.tfm \
tex-kmbx7.tfm \
tex-kmbx8.tfm \
tex-kmbx9.tfm \
tex-kmbxsl10.tfm \
tex-kmbxti10.tfm \
tex-kmcsc10.tfm \
tex-kmcsc8.tfm \
tex-kmcsc9.tfm \
tex-kmdunh10.tfm \
tex-kmff10.tfm \
tex-kmfi10.tfm \
tex-kmfib8.tfm \
tex-kminch.tfm \
tex-kmitt10.tfm \
tex-kmr10.tfm \
tex-kmr12.tfm \
tex-kmr17.tfm \
tex-kmr5.tfm \
tex-kmr6.tfm \
tex-kmr7.tfm \
tex-kmr8.tfm \
tex-kmr9.tfm \
tex-kmsl10.tfm \
tex-kmsl12.tfm \
tex-kmsl8.tfm \
tex-kmsl9.tfm \
tex-kmsltt10.tfm \
tex-kmss10.tfm \
tex-kmss12.tfm \
tex-kmss17.tfm \
tex-kmss8.tfm \
tex-kmss9.tfm \
tex-kmssbx10.tfm \
tex-kmssdc10.tfm \
tex-kmssi10.tfm \
tex-kmssi12.tfm \
tex-kmssi17.tfm \
tex-kmssi8.tfm \
tex-kmssi9.tfm \
tex-kmssq8.tfm \
tex-kmssqi8.tfm \
tex-kmtcsc10.tfm \
tex-kmti10.tfm \
tex-kmti12.tfm \
tex-kmti7.tfm \
tex-kmti8.tfm \
tex-kmti9.tfm \
tex-kmtt10.tfm \
tex-kmtt12.tfm \
tex-kmtt8.tfm \
tex-kmtt9.tfm \
tex-kmu10.tfm \
tex-kmvtt10.tfm \
tex-kmvtti10.tfm \
tex-lmabthhs.fd \
tex-lmabthhw.fd \
tex-lmabthvs.fd \
tex-lmabthvw.fd \
tex-lmaenc.def \
tex-lmccmdh.fd \
tex-lmccmfib.fd \
tex-lmccmfr.fd \
tex-lmccmiss.fd \
tex-lmccmr.fd \
tex-lmccmss.fd \
tex-lmccmssq.fd \
tex-lmccmtt.fd \
tex-lmccmvtt.fd \
tex-lmcenc.def \
tex-lmclcmss.fd \
tex-lmobcghs.fd \
tex-lmobcghw.fd \
tex-lmobcgvs.fd \
tex-lmobcgvw.fd \
tex-lmoenc.def \
tex-lmsbcgh.fd \
tex-lmsbcgv.fd \
tex-lmsenc.def \
tex-lmubxghs.fd \
tex-lmubxghw.fd \
tex-lmubxgvs.fd \
tex-lmubxgvw.fd \
tex-lmuenc.def \
tex-mls.sty \
tex-mlsgalig.tex \
tex-mlstrans.tex \
tex-mnhyphex.tex \
tex-mongolian.map \
tex-rlbicig.sty \
tex-russian.def \
tex-xalx.def \
texlive-montex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-diagnose.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lscape.sty \
tex-rotating.sty \
tex-updmap.cfg \
texlive \
texlive-cbfonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-montex-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
