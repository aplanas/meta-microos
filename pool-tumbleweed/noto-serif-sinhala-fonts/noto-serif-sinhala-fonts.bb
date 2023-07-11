SUMMARY = "Noto Sinhala Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-sinhala-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0f4626e589792419ac83eae29d29e3d824498c0441040b81552c41e440b7a91824e60317f04703a6a5c047ad499800013657e23b08ff5de659ac4516a5e1f74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-sinhala \
noto-serif-sinhala-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
