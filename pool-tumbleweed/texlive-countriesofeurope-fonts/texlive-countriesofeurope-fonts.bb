SUMMARY = "Severed fonts for texlive-countriesofeurope"
DESCRIPTION = "The  separated fonts package for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-fonts-2023.209.0.0.23svn54512-55.1.noarch.rpm"
RPM_HASH = "d0e53460991b0b61f5808234274441645fa18fa6d065875dbaf940f1bd933bdb06e7d246e9d26f2e7f2fde78c9d44f3eaede598862c3edd370c7d72a9e0c97cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-countriesofeurope-fonts \
font--lang=fj \
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
font-countriesofeurope \
texlive-countriesofeurope-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
