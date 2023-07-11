SUMMARY = "Noto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "83e8ee4fba167c5e545f3e55634197d21fa718a832f6ca87e1521b734fc02aa243653a13e119f1cf77cee527c20119c4078b8e46cce99bff7da80e3eb511adda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif \
noto-serif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
