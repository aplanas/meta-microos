SUMMARY = "Severed fonts for texlive-xcharter-math"
DESCRIPTION = "The  separated fonts package for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-fonts-2023.209.0.0.36svn65686-53.1.noarch.rpm"
RPM_HASH = "92a69b3b12c6049cdd5fb9a758e8cbcdf57e2dc4d043629208d25bff6599c3460df349ebb25ea9ebc9d9ebbbbe8dc7e68e8a4f979d9cb7709532182b41224e67"
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
font-xcharter-math-bold \
font-xchartermath \
texlive-xcharter-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
