SUMMARY = "Severed fonts for texlive-gillius"
DESCRIPTION = "The  separated fonts package for texlive-gillius"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64865"

RPM_NAME = "texlive-gillius-fonts-2023.201.svn64865-52.1.noarch.rpm"
RPM_HASH = "f08f5d7b4a7cdc2ebfa5ac5f3e522cc1218d6f8f1f09172d05a631e92499474700d145a643cb0b0c48ce34722dd7a1199a57154a27be361826f41d8a45a459f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gillius-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
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
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=kwm \
font--lang=lb \
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
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
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
font--lang=tl \
font--lang=tn \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-gilliusadf \
font-gilliusadfcond \
font-gilliusadfno2 \
font-gilliusadfno2cond \
texlive-gillius-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
