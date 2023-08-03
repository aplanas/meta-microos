SUMMARY = "Severed fonts for texlive-carolmin-ps"
DESCRIPTION = "The  separated fonts package for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-carolmin-ps-fonts-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "6f2abb9e78c70a40b22bd432a252d590c8ffe1050844c0042555cb1fd20d038ffb1234deb451f2c67f0bbdc331c49158883aac503524648a0d607b32feb4614c"
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
font-carolinganminuscules \
texlive-carolmin-ps-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
