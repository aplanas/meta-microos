SUMMARY = "Severed fonts for texlive-hmtrump"
DESCRIPTION = "The  separated fonts package for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-fonts-2023.209.1.2asvn54512-54.2.noarch.rpm"
RPM_HASH = "5217ed21da36fc86aa41c589d20d2ad4ba5c801d926dc91b787351c3c2df5187034a83b1679a4a93bbbba9e4133c5c73caf2af8bc44a8054de3f78c59b6865de"
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
font-nkd04playingcard'sindex \
texlive-hmtrump-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
