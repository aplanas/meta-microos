SUMMARY = "Severed fonts for texlive-semaphor"
DESCRIPTION = "The  separated fonts package for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn18651"

RPM_NAME = "texlive-semaphor-fonts-2023.209.svn18651-54.1.noarch.rpm"
RPM_HASH = "932ae106d8f6c3c93db62a60c060198b96196674dbcf293261419d718a28c60dec769c4cb6f0a6466d049e8fb98522cc8bbccc7b1ecd73a919feabd17a88b9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-semaphor-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=cs \
font--lang=csb \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fur \
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
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=ng \
font--lang=nl \
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
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-semafor \
texlive-semaphor-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
