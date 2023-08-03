SUMMARY = "Severed fonts for texlive-tapir"
DESCRIPTION = "The  separated fonts package for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn20484"

RPM_NAME = "texlive-tapir-fonts-2023.209.0.0.2svn20484-55.1.noarch.rpm"
RPM_HASH = "6097c2c68a3ec95bdf8cb5d587c2233499e598b5f5fe856cf2ecbbba165a1fbb5a9b4f9908a406ad888cc625a86cb8214c6d1ed7463be38f0d054d6552c67de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=cs \
font--lang=de \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mg \
font--lang=ms \
font--lang=nds \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sk \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-tapir \
texlive-tapir-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
