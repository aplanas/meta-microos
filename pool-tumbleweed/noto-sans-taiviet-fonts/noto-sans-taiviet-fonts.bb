SUMMARY = "Noto Tai Viet Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiViet Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taiviet-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "94bfd460efbb66818e37e24215ae6e8b98d2bee0857f2c9c09648ddbc8469a69741ffa30ceb3ef7acc8a8c4872503770edcfe75e89c7cc3696918b981f9daca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taiviet \
noto-sans-taiviet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
