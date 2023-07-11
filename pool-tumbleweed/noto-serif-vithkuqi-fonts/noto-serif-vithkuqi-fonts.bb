SUMMARY = "Noto Vithkuqi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-vithkuqi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "115a514d063b5a7c7c72a9ea13e87383cf6614ed01ff449f5f32b23fb83e334a1642a2c845644bd11308fd78a7efdfd963b58b0618312bfcf0c0085668b0a585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-vithkuqi \
noto-serif-vithkuqi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
