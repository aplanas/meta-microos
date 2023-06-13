SUMMARY = "Noto Tamil Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamil-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f023f48a853f28d3025d7cc0783ac75a0a27e09cc0326eb4b760b770f6fc201e9e01087ecf95c52918e50d18154afe3b66b6dc3246ba0fd8d3dc283ac4368d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamil \
noto-sans-tamil-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
