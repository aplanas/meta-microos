SUMMARY = "Severed fonts for texlive-pxfonts"
DESCRIPTION = "The  separated fonts package for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pxfonts-fonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "b96a1dbdacddf5fdb5edac661d76ed359e770a884c1e514b2e0c96a818db3e4fa54bbb323598d3f860ef7f24b7fe9a97c6a3b9e0d138cff293b9c0c5e549f29c"
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
