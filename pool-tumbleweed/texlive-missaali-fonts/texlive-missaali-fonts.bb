SUMMARY = "Severed fonts for texlive-missaali"
DESCRIPTION = "The  separated fonts package for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2023.201.2.0svn61719"

RPM_NAME = "texlive-missaali-fonts-2023.201.2.0svn61719-54.1.noarch.rpm"
RPM_HASH = "acb745c3b3375dc39367d43b01e4e321381634dff16e7260a19e67ac29eb63320e04a15cd1549cda48a14f748f626bf6d2f8d8a21dd3b8b29f7186e282ca4188"
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

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
