SUMMARY = "Noto Duployan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Duployan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-duployan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7cab0dd1d88f66d929ba2c2204efb5595627dc4ef9b4d6d78390fe56fa064039788b5cb3b9550a0dc182eb0c2f4d3d5b307a0eb9828b2b5cd6bfee9a23728091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-duployan \
noto-sans-duployan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
