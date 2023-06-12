SUMMARY = "Noto Serif Simplified Chinese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Black weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-black-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "7f463323fe2b81cc080dc29055d4565f1489198b837245ab031a3861cd3d648bac937acf187e17a0d820c35e8e1b84c7f72865c94ac37ca4103ab28d9e708623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-black-fonts \
noto-serif-sc-black-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
