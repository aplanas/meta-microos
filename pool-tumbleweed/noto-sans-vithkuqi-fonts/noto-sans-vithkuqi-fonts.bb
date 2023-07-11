SUMMARY = "Noto Vithkuqi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-vithkuqi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "13711c536f3a1b8c7816ea2e3407209439f7d1b4dcd5fa724d3767c17efa58f274e8b6cc7306b7e935e7210e02feee0827cabfc4f176f62de40db3688acea68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-vithkuqi \
noto-sans-vithkuqi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
