SUMMARY = "Severed fonts for texlive-adforn"
DESCRIPTION = "The  separated fonts package for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn54512"

RPM_NAME = "texlive-adforn-fonts-2023.201.1.1bsvn54512-54.1.noarch.rpm"
RPM_HASH = "0dbc13163e09fcc8c8cbc2588a56b09556db0e0d3ee2b7da0d2c4577eb43e8c6bcb8ced66dec5cae7f8f4e709976bd932f9fe43a0c66343b2d7d3b24fbeae3ed"
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
