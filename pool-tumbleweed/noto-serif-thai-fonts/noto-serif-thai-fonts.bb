SUMMARY = "Noto Thai Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-thai-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5fd29ca56ad61d8dffbc14c987203f41f2addf15d097c06077da52a146197f068eef39bab49f465266674f62dff9749956164a1fe4d3aaeed36031a82f5683a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-thai \
noto-serif-thai-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
