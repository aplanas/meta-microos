SUMMARY = "Severed fonts for texlive-punknova"
DESCRIPTION = "The  separated fonts package for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-fonts-2023.209.1.003svn24649-54.1.noarch.rpm"
RPM_HASH = "1d956b27f977d05dd8edb819fa95e4df6956f5bd55f21e00c01cbad248615bc945d6daaf4474613ae16ccecbcd588838d9c832f2d395f67f3a80eb9ea426598c"
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
