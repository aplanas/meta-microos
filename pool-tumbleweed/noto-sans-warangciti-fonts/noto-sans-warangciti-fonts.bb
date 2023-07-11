SUMMARY = "Noto Warang Citi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
WarangCiti Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-warangciti-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7205542ecdc0d3f8f22608d612552bb51fe7ba24965524597778902a7c907e71bfbc15211dc114f235ffd5a063ddf678a851ca7768ab137a49c2f33b08944739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-warangciti \
noto-sans-warangciti-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
