SUMMARY = "Noto Serif Traditional Chinese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Black weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-black-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "c253cbb9995566e4b6f5a4f66d1fac8c6f5a5ff355b473890fd08bd1582b5de7631f1802e2bbacdebc2a6d25f7fd5d6a0be33034b2ed7f980c38022cf074ef97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-black-fonts \
noto-serif-tc-black-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
