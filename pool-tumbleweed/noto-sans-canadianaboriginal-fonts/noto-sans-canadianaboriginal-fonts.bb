SUMMARY = "Noto Canadian Aboriginal Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CanadianAboriginal Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-canadianaboriginal-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "8f7dc4635a59538622bb9947a5621ec7b84b41f37d99c30d704e3bc683a3d0df381b50c2ad35f050c5060bd06a7eaaa51af242c08beb62d41c03ce820d634bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-canadianaboriginal \
noto-sans-canadianaboriginal-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
