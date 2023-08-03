SUMMARY = "Severed fonts for texlive-adfsymbols"
DESCRIPTION = "The  separated fonts package for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-fonts-2023.209.1.2bsvn54512-55.1.noarch.rpm"
RPM_HASH = "a5c380fea93f10cd2a3367cc03cca9b21577992e3ec8e964b0b5f5872eee548e74038fbd050d1d3ec1e34442f4bd011613fc2954aa7add82b9114dea8d537f4d"
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
font-arrowsadf \
font-bulletsadf \
texlive-adfsymbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
