SUMMARY = "Noto Balinese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-balinese-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6eb1c65a4239f26644e885c0da9016d16b94f7d04b92f848a2762de5643e78426c42c96f6336fc513d531ba2c6db646afaa7206e9ccd9ef372b92cb01a27d0da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-balinese \
noto-sans-balinese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
