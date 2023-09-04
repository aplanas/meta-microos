SUMMARY = "Severed fonts for texlive-xcharter-math"
DESCRIPTION = "The  separated fonts package for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-fonts-2023.209.0.0.36svn65686-53.2.noarch.rpm"
RPM_HASH = "fce195116a631a6a2625892d5854195d19cc5b2c7a65ad16908de0dbffa0b7d985b7b5dd7f9f68f8b5421f99ea3141109e13d73eba519836e8fbbdef2b0bff8f"
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
