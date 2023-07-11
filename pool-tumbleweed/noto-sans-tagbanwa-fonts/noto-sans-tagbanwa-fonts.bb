SUMMARY = "Noto Tagbanwa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagbanwa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tagbanwa-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "1c768a59888b10266c3a66eb9eb878776027dc956637f53d98c7b8cfb60a62bbdd739fcad097c1c6dc60aa4f5da4459e445ead772a6339bacca4f5d55e84a1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tagbanwa \
noto-sans-tagbanwa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
