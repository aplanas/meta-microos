SUMMARY = "Severed fonts for texlive-boondox"
DESCRIPTION = "The  separated fonts package for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02dsvn54512"

RPM_NAME = "texlive-boondox-fonts-2023.209.1.02dsvn54512-53.1.noarch.rpm"
RPM_HASH = "daeafeb4cd3e23c51d4b8bc1f720cca8da91244dc7effdf5356ea40772f7adf152ce847efb113d7f7b25f887a0d8d0ad71d1178073ce595971014b4b64eddaca"
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
font-boondoxcalligraphic \
font-boondoxdoublestruck \
font-boondoxfraktur \
font-boondoxuprscr \
texlive-boondox-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
