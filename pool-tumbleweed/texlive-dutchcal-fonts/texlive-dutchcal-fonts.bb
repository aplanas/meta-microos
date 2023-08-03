SUMMARY = "Severed fonts for texlive-dutchcal"
DESCRIPTION = "The  separated fonts package for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-dutchcal-fonts-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "2a0da5861ac8274d15922cd0ef7d583e89ea56e70567a2298dd53c4d76024b87edd37594dde6d7aa4432d45fe9650db6aafab6c5a29c7e7195c668135f4c8cc1"
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
font-dutchcalligraphic \
texlive-dutchcal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
