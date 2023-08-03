SUMMARY = "Severed fonts for texlive-doublestroke"
DESCRIPTION = "The  separated fonts package for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.111svn15878"

RPM_NAME = "texlive-doublestroke-fonts-2023.209.1.111svn15878-53.1.noarch.rpm"
RPM_HASH = "50045163f18fc782c40c69a0ba5740b0285cd148d67f59f1cee642959502d131bcac67951041a06aec3f45b96b95f9859aeedeb23509341b6bd2646f1c8de0e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dsrom10 \
font-dsrom12 \
font-dsrom8 \
font-dsss10 \
font-dsss12 \
font-dsss8 \
texlive-doublestroke-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
