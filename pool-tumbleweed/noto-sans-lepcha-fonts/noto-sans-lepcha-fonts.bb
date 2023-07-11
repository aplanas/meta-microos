SUMMARY = "Noto Lepcha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lepcha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lepcha-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "288994b22b42c73e2f0597c13666915d7c6df7c9ca7699689ac47e8d2e3873f2a5e25e26228ee5078b4ed8ed9a7f836e2e3c21a58301522d31085cca9902c37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lepcha \
noto-sans-lepcha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
