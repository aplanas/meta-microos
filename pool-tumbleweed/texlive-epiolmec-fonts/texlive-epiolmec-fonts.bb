SUMMARY = "Severed fonts for texlive-epiolmec"
DESCRIPTION = "The  separated fonts package for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-fonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "5e60646a02aa716cfd0a6536d2ce0c6ec59259b13bbde62acfeb7ebc3064024fcac044666179d1c4e62e2d09727a5f02b4e0ca9c0363d808da1c2e5a8851e891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-epi-olmce \
texlive-epiolmec-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
