SUMMARY = "Severed fonts for texlive-ibarra"
DESCRIPTION = "The  separated fonts package for texlive-ibarra"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64567"

RPM_NAME = "texlive-ibarra-fonts-2023.209.svn64567-54.1.noarch.rpm"
RPM_HASH = "b78efb55f97e5bea3a986ecea13c01483c9597401c3c7850cbdedc4df89ff92b52cc3da92453ad04e2da65fbc73f77ba6ff2f5680c27267e1b105635aad35533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-ibarra-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
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
font--lang=hr \
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
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=ms \
font--lang=mt \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sg \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=smn \
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
font-ibarrarealnova \
font-ibarrarealnova-bold \
font-ibarrarealnova-bolditalic \
font-ibarrarealnova-italic \
font-ibarrarealnova-regular \
font-ibarrarealnova-semibold \
font-ibarrarealnova-semibolditalic \
font-ibarrarealnovasemibold \
texlive-ibarra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
