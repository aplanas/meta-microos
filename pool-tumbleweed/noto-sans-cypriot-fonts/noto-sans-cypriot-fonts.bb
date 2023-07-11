SUMMARY = "Noto Cypriot Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cypriot Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cypriot-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4b1b8f15dca69e2385402c8804a443fa4fba59ea11b3d1cb26cb772fefc1d14b36aa324040b8b965555e572e38c84306287f547a3f384eb476b533c8e03cfec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cypriot \
noto-sans-cypriot-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
