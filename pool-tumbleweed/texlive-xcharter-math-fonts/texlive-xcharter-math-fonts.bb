SUMMARY = "Severed fonts for texlive-xcharter-math"
DESCRIPTION = "The  separated fonts package for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-fonts-2023.201.0.0.36svn65686-52.2.noarch.rpm"
RPM_HASH = "cd0195abf27ee0662ac42892339c6da8998c029cab3f08b12d54091df0d53bedc19405ad1105c0e7e232737ffaa6e087f6ca6b2286c75e751d44c26724cb0717"
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
