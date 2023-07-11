SUMMARY = "Noto Kannada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kannada-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "373f387de38c5bb73b3473d5218e06467f777b97143c1279dd148dac1aae43aaa7e433f5f63195c486af792b61177d07f2095ca7f9b334374bfc8be93045f4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kannada \
noto-sans-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
