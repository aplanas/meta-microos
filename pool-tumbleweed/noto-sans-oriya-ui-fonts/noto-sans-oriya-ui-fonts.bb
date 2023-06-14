SUMMARY = "Noto Oriya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oriya-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "fcc32a972a2db25e90df8b4701ce16d2d0f423c16c5e1856f66151a3792427af2666d3bfbee97d314190ffed07da9177720e6e003fca8923ae195a488345d133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oriya-ui \
noto-sans-oriya-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
