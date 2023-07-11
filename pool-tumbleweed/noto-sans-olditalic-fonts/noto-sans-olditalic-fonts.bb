SUMMARY = "Noto Old Italic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldItalic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-olditalic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "28236d644156a8d8a65a762be715c9bdbffab782fcee23455f6e57c75b4613312574181f0e89da4d6ca46715f3f0ce233ef8e976dd6042203b74306fdc9acb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-olditalic \
noto-sans-olditalic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
