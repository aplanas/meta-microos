SUMMARY = "Noto Mandaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mandaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mandaic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "780ccedb37ad4974029a009f98b6768161c64010bed7d30ffd51777e22d45a7c1286150c33acc5769d735d2504f7a29869f3db8ec47f0c1389b44f506e7418b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mandaic \
noto-sans-mandaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
