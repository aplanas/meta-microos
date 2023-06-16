SUMMARY = "Noto Nabataean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nabataean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nabataean-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "239ce772b290dab0a28af361272726af21cd81da4e7ff7b4c8f6530de5a4a5210a7ee055d2fa6a1c19a3d3d12fdf79ea8bf0656fab1de07cfc1aeb9a69df6d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nabataean \
noto-sans-nabataean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
