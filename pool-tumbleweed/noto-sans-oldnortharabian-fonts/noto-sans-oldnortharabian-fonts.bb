SUMMARY = "Noto Old North Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldNorthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldnortharabian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5594b997158f01c81efc18849d7b2d9082f8214c60905a2eec479d079a94e762a0668dee3452b77979b06657b72b2fb77ce79a9a78b87081a9cc708a22f238a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldnortharabian \
noto-sans-oldnortharabian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
