SUMMARY = "Noto Tifinagh Hawad Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghHawad Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghhawad-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "edf35d3f2136b5cc229575951b58491f0167c1b68eaf2887130232c848608c578863a5d32e0e5ad373db3b053c4929d02ad5544d587dcfac8bbfe2f9a4c321d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghhawad \
noto-sans-tifinaghhawad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
