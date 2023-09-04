SUMMARY = "Severed fonts for texlive-pxfonts"
DESCRIPTION = "The  separated fonts package for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pxfonts-fonts-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "e76de087cf128c8adf0ecbb57d7bb9eb7806aa7ad1988dae7c13c67f437ac8594413ce1f5120026b2c16119783a591d1274a77e4d99a66456a518a3a0a4b791c"
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
font-pxbex \
font-pxbexa \
font-pxbmia \
font-pxbsy \
font-pxbsya \
font-pxbsyb \
font-pxbsyc \
font-pxex \
font-pxexa \
font-pxmia \
font-pxsy \
font-pxsya \
font-pxsyb \
font-pxsyc \
font-rpcxb \
font-rpcxbi \
font-rpcxi \
font-rpcxr \
font-rpxb \
font-rpxbi \
font-rpxbmi \
font-rpxbsc \
font-rpxi \
font-rpxmi \
font-rpxr \
font-rpxsc \
texlive-pxfonts-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
