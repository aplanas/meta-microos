SUMMARY = "Severed fonts for texlive-ascii-font"
DESCRIPTION = "The  separated fonts package for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn29989"

RPM_NAME = "texlive-ascii-font-fonts-2023.209.2.0svn29989-54.1.noarch.rpm"
RPM_HASH = "038b7e29b8616cadb65cffd06259af4a4ce98bf98f415f531faf9f6f9cf668e656d700f30aba060666a52efc2e045390973e177bea79fcccfa9085e67d983d65"
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
font-ascii \
texlive-ascii-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
