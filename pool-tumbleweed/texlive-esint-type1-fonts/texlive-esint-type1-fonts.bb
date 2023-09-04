SUMMARY = "Severed fonts for texlive-esint-type1"
DESCRIPTION = "The  separated fonts package for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-esint-type1-fonts-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "a09a9cede62f39c9c0fca0424810783d160f878952edb32abb813694e6ed2fb82220164288c0e549eccc6a8b60611dd23d777bb15292cfe97209739e569b45c9"
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
font-esint10 \
texlive-esint-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
