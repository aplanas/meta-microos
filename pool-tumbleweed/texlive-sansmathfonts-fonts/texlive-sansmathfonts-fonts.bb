SUMMARY = "Severed fonts for texlive-sansmathfonts"
DESCRIPTION = "The  separated fonts package for texlive-sansmathfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64661"

RPM_NAME = "texlive-sansmathfonts-fonts-2023.209.svn64661-54.1.noarch.rpm"
RPM_HASH = "849183ef4d68b348980191433fe23adf04f5a7fff342caa7448f3d0378f3549acfe45d031d2584cab7adc4438e57fc7c5fe4361103e45bfdfd166f5533459482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=sk \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-computermodern \
font-computermodernsans \
font-europeancomputermodern \
font-ssesint10 \
font-ssesint7 \
font-ssesint8 \
font-ssesint9 \
font-ssmsam10 \
font-ssmsam5 \
font-ssmsam6 \
font-ssmsam7 \
font-ssmsam8 \
font-ssmsam9 \
font-ssmsbm10 \
font-ssmsbm5 \
font-ssmsbm6 \
font-ssmsbm7 \
font-ssmsbm8 \
font-ssmsbm9 \
texlive-sansmathfonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
