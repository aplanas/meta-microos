SUMMARY = "Severed fonts for texlive-missaali"
DESCRIPTION = "The  separated fonts package for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0svn61719"

RPM_NAME = "texlive-missaali-fonts-2023.209.2.0svn61719-55.1.noarch.rpm"
RPM_HASH = "49a49fbf45304ba3c4199cde0bdedf355a359c2539154c63b4bc1da26d6da389375ed5399219f8e3a14fbc1064e4fd27d5c1ce07d2734a7ec6d7316d017b1527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=de \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=nds \
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
font--lang=vo \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-missaali \
texlive-missaali-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
