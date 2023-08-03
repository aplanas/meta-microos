SUMMARY = "Severed fonts for texlive-dsserif"
DESCRIPTION = "The  separated fonts package for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2023.209.1.031svn60898"

RPM_NAME = "texlive-dsserif-fonts-2023.209.1.031svn60898-53.1.noarch.rpm"
RPM_HASH = "1da8d8c8db652aa44f1f9daf4e6d9f8cb9d2f3d48862d466d7bc4179dc49df4ab8667b78f9025a97e1fb5110a0f249d65088999a0af122e46a30dff5701eda9c"
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
font-dsserif \
font-dsserifuni \
texlive-dsserif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
