SUMMARY = "Noto Rejang Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Rejang Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-rejang-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "8897b19001a1ac7ce2438f24244a5b45957c9cd67c1360dbc6dc5c00cf177651bef13a788c769962ccb34da0e31361f03cca3abc7ead8502c0a25fdba2f7489a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-rejang \
noto-sans-rejang-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
