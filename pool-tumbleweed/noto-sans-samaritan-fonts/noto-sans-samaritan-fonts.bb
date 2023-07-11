SUMMARY = "Noto Samaritan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Samaritan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-samaritan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "8d90e9790729ad4efbebb833e0a5dfac72bb5f68468af2a15abce713c822a3657ccc3a9e3f4adcf7470df49fe4be410bf09f4c5d22aea5751ad6336382195aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-samaritan \
noto-sans-samaritan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
