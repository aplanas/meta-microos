SUMMARY = "Noto Thai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thai-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ca5dfb8285606f65df94615b11e13265519d4f58cc76996fe0d7bdebd44517d884811b9eefb2a9973ac514f58912039862f55112b31d342644377ffcd03ef89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thai \
noto-sans-thai-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
