SUMMARY = "Severed fonts for texlive-euler-math"
DESCRIPTION = "The  separated fonts package for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-fonts-2023.209.0.0.31svn65685-53.1.noarch.rpm"
RPM_HASH = "568792ccd1286927c58a50002e79585da3b8569158a0ce1d01dcd262589f5bfd90c2e9378190e7e7faeb2afa0769600ce345c49ad4ab3c680198766972914b0d"
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
font-eulermath \
texlive-euler-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
