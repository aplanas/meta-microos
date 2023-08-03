SUMMARY = "Severed fonts for texlive-erewhon-math"
DESCRIPTION = "The  separated fonts package for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-fonts-2023.209.0.0.56svn65684-54.1.noarch.rpm"
RPM_HASH = "e7035bc98d4aedb30516fd56c423a432120fe3d3000cfa54e2c3275ea7eb2637553e8847b28158a43182e31f4182a746454f219da1ea6105f26ce790bce5ef35"
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
font-erewhon \
font-erewhonmath \
texlive-erewhon-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
