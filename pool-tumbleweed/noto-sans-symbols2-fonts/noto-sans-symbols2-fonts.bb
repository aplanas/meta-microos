SUMMARY = "Noto Symbols2 Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols2 Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-symbols2-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c675aa31586e1ea334928d44312299137d82634159418cf41fe356c13dfb2f5dd8051270e90d399ac2352b976083de5224b6c46f8bf2d0bffe909efd34f6457b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-symbols2 \
noto-sans-symbols2-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
