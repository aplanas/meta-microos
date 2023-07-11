SUMMARY = "Severed fonts for texlive-erewhon-math"
DESCRIPTION = "The  separated fonts package for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-fonts-2023.201.0.0.56svn65684-53.2.noarch.rpm"
RPM_HASH = "a4987ad90c3d3f0634213be411f838742b6444169bcf27840c40a75a1a40c30aaad4fb7cb745fdf62911880a267d26dd4a05aa7a4cf1df6e75d6c231fca2e167"
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
