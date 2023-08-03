SUMMARY = "Severed fonts for texlive-spark-otf"
DESCRIPTION = "The  separated fonts package for texlive-spark-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.05asvn62481"

RPM_NAME = "texlive-spark-otf-fonts-2023.209.0.0.05asvn62481-58.1.noarch.rpm"
RPM_HASH = "cb5eaeadb7e0d275591ba8c8f2baf14e1ab80ffb88f585101e1502c9134e9d712f57ee5534efe3cafcb02a362a2d270886e1ee3f7bbec7e324d1c6e80b6788ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=da \
font--lang=de \
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
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-sparks \
font-sparksbarextra-narrow \
font-sparksbarextra-wide \
font-sparksbarmedium \
font-sparksbarnarrow \
font-sparksbarwide \
font-sparksdot-lineextra-thick \
font-sparksdot-lineextra-thin \
font-sparksdot-linemedium \
font-sparksdot-linethick \
font-sparksdot-linethin \
font-sparksdotextra-large \
font-sparksdotextra-small \
font-sparksdotlarge \
font-sparksdotmedium \
font-sparksdotsmall \
texlive-spark-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
