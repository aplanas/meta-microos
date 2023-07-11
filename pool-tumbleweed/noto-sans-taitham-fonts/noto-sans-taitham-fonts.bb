SUMMARY = "Noto Tai Tham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiTham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taitham-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3b63565d79248a726fbd2f464d739c459f984f9f1fb21c377e871661f3742e56eca3209bde5f8cb99658c25bb547f5536a952a039cbcb617380a088feb86c2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taitham \
noto-sans-taitham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
