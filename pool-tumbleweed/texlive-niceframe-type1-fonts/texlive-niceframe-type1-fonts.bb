SUMMARY = "Severed fonts for texlive-niceframe-type1"
DESCRIPTION = "The  separated fonts package for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44671"

RPM_NAME = "texlive-niceframe-type1-fonts-2023.209.svn44671-55.1.noarch.rpm"
RPM_HASH = "cf8dcc755fb5b72af41e6cf58a77e101cc5cbc528728a70bd4f9c47a16fa72cfb390b620f6f0db215f490ae086aa3371de1d88cbc3bdde7005dd44ee3f85cfb3"
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
font-bbding \
font-dingbat \
font-karta \
font-umranda \
font-umrandb \
texlive-niceframe-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
