SUMMARY = "Severed fonts for texlive-epiolmec"
DESCRIPTION = "The  separated fonts package for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "a5b955c6a0c04af5c8ee26064d271adf32f04dfbefe446e21944bb976a1b667e0698d102c921440d4237c3d2c8564924abe625a372a827a9e940eb3aeff9dc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
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
font-epi-olmce \
texlive-epiolmec-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
