SUMMARY = "Noto Khudawadi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khudawadi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khudawadi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2f108b5f5acd62cc774a226ad31053bb7be09686b4493526ebf37c569f6d95a1db73f18d9357b300dd503ad3099dc857f747df69d4970efb6a323484c0e3816c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khudawadi \
noto-sans-khudawadi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
