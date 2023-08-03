SUMMARY = "Severed fonts for texlive-bboldx"
DESCRIPTION = "The  separated fonts package for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn65424"

RPM_NAME = "texlive-bboldx-fonts-2023.209.1.032svn65424-54.1.noarch.rpm"
RPM_HASH = "6ff25700fb57b4298bd0afb19558e971a2463f1f041f7fc8bcf0ea76d7f76394ea48ab7316407824c78ac019e49eba397ce66c1b44f5207c13dfccb82a390183"
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
font-bboldx \
texlive-bboldx-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
