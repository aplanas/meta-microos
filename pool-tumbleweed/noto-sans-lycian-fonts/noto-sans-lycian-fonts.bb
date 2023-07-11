SUMMARY = "Noto Lycian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lycian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lycian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7e552118e7ef560d35f2e9ba092882043b56cff9eef27362a765617fca6139d6204bab8c09b5e128d27b8334a54c2dc7cdbfb8e1253c0d1672262a32be2d1979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lycian \
noto-sans-lycian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
