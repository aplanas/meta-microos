SUMMARY = "Severed fonts for texlive-hmtrump"
DESCRIPTION = "The  separated fonts package for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-fonts-2023.209.1.2asvn54512-54.1.noarch.rpm"
RPM_HASH = "701fdcc1f96ad2ca88bf1e2ecb31f429307598984eddbf6bb145d4a66add6194262ad576291ad8770150cceb17b0742eabf498413df46240286767dc3e3531bf"
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
