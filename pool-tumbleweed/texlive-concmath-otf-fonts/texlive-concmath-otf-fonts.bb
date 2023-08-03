SUMMARY = "Severed fonts for texlive-concmath-otf"
DESCRIPTION = "The  separated fonts package for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-fonts-2023.209.0.0.25svn65683-54.1.noarch.rpm"
RPM_HASH = "c1f6b571550e80a4a107952469a5286a47ae52b2793429cbba119a5ca951db002b2d0a09d143a46941ca9ef77ace2db297d0075db99c9f5075825403cbd1a865"
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
font-concretemath \
texlive-concmath-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
