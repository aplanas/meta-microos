SUMMARY = "Severed fonts for texlive-initials"
DESCRIPTION = "The  separated fonts package for texlive-initials"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-initials-fonts-2023.209.svn54080-54.1.noarch.rpm"
RPM_HASH = "d678ce2f9a1194c50c325d1d09c4346900cff54e1f782ec9c59a986efa41362d5a75a2c57ba7c16771778ea1242f34c39d1d84443868b9ce64b379ebf6040344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
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
font-acorninitials \
font-annstone \
font-artnouveaucaps \
font-artnouveauinitialen \
font-carrickcaps \
font-eichenlaubinitialen \
font-eileencaps \
font-eileencapsblack \
font-elzeviercaps \
font-gotischeinitialen \
font-goudyinitialen \
font-kinigsteincaps \
font-konanurkaps \
font-kramer \
font-morrisinitialen \
font-nouveaudropcaps \
font-romantik \
font-rothenburgdecorative \
font-royalinitialen \
font-sanremo \
font-starburst \
font-typographercaps \
font-zallmancaps \
texlive-initials-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
