SUMMARY = "Severed fonts for texlive-lxfonts"
DESCRIPTION = "The  separated fonts package for texlive-lxfonts"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0bsvn32354"

RPM_NAME = "texlive-lxfonts-fonts-2023.208.2.0bsvn32354-53.1.noarch.rpm"
RPM_HASH = "3c6439dba3757025a63302c9ddb797d8003be42bbc7a2b2536ce4e74e7df1d0cb1d0ac0a13578eac6bd4362002fd0fbe73c78ca923be456d99253496b78ad6b1"
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
font-lcmbsy8 \
font-lcmex8 \
font-lcmmi8 \
font-lcmmib8 \
font-lcmsy8 \
font-leclb8 \
font-lecli8 \
font-leclo8 \
font-leclq8 \
font-llasy8 \
font-llasyb8 \
font-llcmss8 \
font-llcmssb8 \
font-llcmssi8 \
font-llcmsso8 \
font-lmsam8 \
font-lmsbm8 \
font-ltclb8 \
font-ltcli8 \
font-ltclo8 \
font-ltclq8 \
texlive-lxfonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
