SUMMARY = "Severed fonts for texlive-almendra"
DESCRIPTION = "The  separated fonts package for texlive-almendra"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64539"

RPM_NAME = "texlive-almendra-fonts-2023.209.svn64539-55.1.noarch.rpm"
RPM_HASH = "a262ed23cefb7e6a604b62afa9703a8921968a0fbe53e7e876e52ab60501eb1dacd2b43f4c905c49d287ecafe662cb8a4bf7f7624539a939c494b510040aa332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-almendra-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=csb \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=eo \
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
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=mt \
font--lang=na \
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
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-almendra \
font-almendrasc \
font-almndr \
font-almndrsc \
texlive-almendra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
