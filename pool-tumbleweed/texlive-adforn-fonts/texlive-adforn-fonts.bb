SUMMARY = "Severed fonts for texlive-adforn"
DESCRIPTION = "The  separated fonts package for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn54512"

RPM_NAME = "texlive-adforn-fonts-2023.209.1.1bsvn54512-55.1.noarch.rpm"
RPM_HASH = "27350b24b80a15617e6e1f78b7519f5e19006c639567b1144df18fec496118fa6ffe3b6a0339c68805ce3054b01d2c1403dc0ada15f25f851794449abea668ba"
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
font-ornementsadf \
texlive-adforn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
