SUMMARY = "Severed fonts for texlive-fandol"
DESCRIPTION = "The  separated fonts package for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn37889"

RPM_NAME = "texlive-fandol-fonts-2023.201.0.0.3svn37889-52.1.noarch.rpm"
RPM_HASH = "6dafb0a8bf724c799f91f5f589bc3109309c38a54878234e667b41bd99e9c110fba433794d0b516dee0af8d94e6d8cb672efaacfe83227e815c644a4c49b31e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=ii \
font--lang=io \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=os \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sel \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zh-cn \
font--lang=zh-sg \
font--lang=zu \
font-fandolbraille \
font-fandolbrailledisplay \
font-fandolbrailleregular \
font-fandolfang \
font-fandolfangr \
font-fandolhei \
font-fandolkai \
font-fandolsong \
texlive-fandol-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
