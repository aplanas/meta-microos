SUMMARY = "Severed fonts for texlive-padauk"
DESCRIPTION = "The  separated fonts package for texlive-padauk"
LICENSE = "OFL-1.1"

PV = "2023.209.3.002svn42617"

RPM_NAME = "texlive-padauk-fonts-2023.209.3.002svn42617-52.1.noarch.rpm"
RPM_HASH = "8500c2c9c8e066487bc57c89f7d4122d66ccce0a1c660d7085d3bcf73034c2c600bb4b728cc2c09a20e830e30a7e77c6dcf97763341891f0926ff02325cc56cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=my \
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
font-padauk \
font-padaukbook \
texlive-padauk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
