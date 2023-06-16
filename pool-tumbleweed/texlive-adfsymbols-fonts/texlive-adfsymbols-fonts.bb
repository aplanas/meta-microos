SUMMARY = "Severed fonts for texlive-adfsymbols"
DESCRIPTION = "The  separated fonts package for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-fonts-2023.201.1.2bsvn54512-54.1.noarch.rpm"
RPM_HASH = "b2892ff2ff1652855df4ebea65a68cab4ba4f64b19f583c2118cd0dcdf939ada666ce28bd585a9c8c196ca1b18e95950c03fc3045f5f86755d5ecdd6d50cab16"
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
font-arrowsadf \
font-bulletsadf \
texlive-adfsymbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
