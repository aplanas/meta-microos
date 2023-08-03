SUMMARY = "Severed fonts for texlive-talos"
DESCRIPTION = "The  separated fonts package for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.0svn61820"

RPM_NAME = "texlive-talos-fonts-2023.209.1.0svn61820-55.1.noarch.rpm"
RPM_HASH = "a570dc6746d8976cb541ab903fc6641bb48853d4e041c2cd407b74db8cc5bd6d518a0bcd56b065813261c4e9617e670edac568e133908a509b3958e132abf4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font--lang=fj \
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
font-talos \
texlive-talos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
