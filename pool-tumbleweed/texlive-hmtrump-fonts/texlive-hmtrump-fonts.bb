SUMMARY = "Severed fonts for texlive-hmtrump"
DESCRIPTION = "The  separated fonts package for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-fonts-2023.201.1.2asvn54512-53.2.noarch.rpm"
RPM_HASH = "c9a1efd422620719483b0d002fe00974479eda8574479213a783a205796851575156fe25fe5da9305ddd25f23ab5b7a3060caa788b2d1c61ad22ab19a837a794"
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
font-nkd04playingcard'sindex \
texlive-hmtrump-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
