SUMMARY = "Noto Math Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Math Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-math-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "58edb9814c440e715d6f3dcd623f89ff4b0eeea89b32d66afa79823bda3cf02bc05180a2f777c9376d0d6d7e62cd04199df4aef1aefeb3ea446302e5c3d5d1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-math \
noto-sans-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
