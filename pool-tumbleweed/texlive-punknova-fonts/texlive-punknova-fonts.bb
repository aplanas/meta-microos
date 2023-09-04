SUMMARY = "Severed fonts for texlive-punknova"
DESCRIPTION = "The  separated fonts package for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-fonts-2023.209.1.003svn24649-54.2.noarch.rpm"
RPM_HASH = "bfaa053a4cf6e84338364976577491578e1c31b34017b4acd6beef95194cd90b7d19eef12e4f3d6dbe20b501b800cc2e65e12cda359cc7d5ccd87513533c3dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
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
font-punknova \
texlive-punknova-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
