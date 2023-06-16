SUMMARY = "Severed fonts for texlive-pxfonts"
DESCRIPTION = "The  separated fonts package for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pxfonts-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "7646b04981370a836194f24bc4ac410d8354fb73cf0f2792e664602173c00c99c84e774c479f0318bad2798bc2d0a1d3a0d2f63bf925b0b3cfd928b7e2b9b270"
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
