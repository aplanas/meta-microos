SUMMARY = "Noto Hanunoo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hanunoo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hanunoo-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "64172b821a79c6ab813c15e97fd3bb98a91ae208e1a6b20a873202e7eec5c7bc4b6ef049a948ce604d725155ab47cedab115577520500159921f08b1b2d803f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hanunoo \
noto-sans-hanunoo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
