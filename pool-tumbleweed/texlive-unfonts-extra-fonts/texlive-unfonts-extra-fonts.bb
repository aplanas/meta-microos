SUMMARY = "Severed fonts for texlive-unfonts-extra"
DESCRIPTION = "The  separated fonts package for texlive-unfonts-extra"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn56291"

RPM_NAME = "texlive-unfonts-extra-fonts-2023.209.svn56291-54.1.noarch.rpm"
RPM_HASH = "bb20ec920b34198853d44f9c28533d29d49c130b00f313df552ec8b6da02a43a90daa02f8d8e579c43a220df764b76692d5f8fb1483a016e53397819a7295035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=da \
font--lang=de \
font--lang=el \
font--lang=en \
font--lang=es \
font--lang=eu \
font--lang=fil \
font--lang=fj \
font--lang=fo \
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
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ko \
font--lang=kum \
font--lang=kwm \
font--lang=lb \
font--lang=lez \
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
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=sel \
font--lang=sg \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tl \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-unjamobatang \
font-unjamodotum \
font-unjamonovel \
font-unjamosora \
font-unpen \
font-unpenheulim \
font-unpilgia \
font-unshinmun \
font-untaza \
font-unvada \
font-unyetgul \
font-은바다 \
font-은신문 \
font-은옛글 \
font-은자모노벨 \
font-은자모돋움 \
font-은자모바탕 \
font-은자모소라 \
font-은타자 \
font-은펜 \
font-은펜흘림 \
font-은필기a \
texlive-unfonts-extra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
