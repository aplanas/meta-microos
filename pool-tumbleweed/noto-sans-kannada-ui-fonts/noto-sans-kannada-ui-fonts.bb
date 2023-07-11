SUMMARY = "Noto Kannada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kannada-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7c57d948ab212f97c399345438cf58c45bdf108d4082ec6198b1c9a0ffa3d88ade378945f6b9a0792c4375280a1d842e3522f981e5d922ac47ca4f9c0c71cd17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kannada-ui \
noto-sans-kannada-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
