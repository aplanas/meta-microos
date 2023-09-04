SUMMARY = "Severed fonts for texlive-erewhon-math"
DESCRIPTION = "The  separated fonts package for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-fonts-2023.209.0.0.56svn65684-54.2.noarch.rpm"
RPM_HASH = "3ea729391577fe5f392abebb1d8d740b771dfe1cff1f1bcc74270c8cd68b8f29a3176d35751ab29990a7cbd263c21c83170b4b714ab0c86d03a171a69cd8df8b"
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
