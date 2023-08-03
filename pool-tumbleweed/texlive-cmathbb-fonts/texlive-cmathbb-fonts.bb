SUMMARY = "Severed fonts for texlive-cmathbb"
DESCRIPTION = "The  separated fonts package for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56414"

RPM_NAME = "texlive-cmathbb-fonts-2023.209.1.0svn56414-54.1.noarch.rpm"
RPM_HASH = "27a657f7f0c9eac028cac8bc23a6e778881d80a4a7874e23a78a2d3e4ffdde4f46448e4d8cec813841c7150ef838e099d6003a8c5c0da61ff4381fd4d1861231"
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
font-cmathbb \
texlive-cmathbb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
