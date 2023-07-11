SUMMARY = "Noto Tifinagh Adrar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAdrar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghadrar-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "8915e828a09da73d62a4f4912ee045fe1ab6035831de7a22cfd126cb9b9f378d1fe523b5f68115d81378ea1ecf979f0c00829f1f4f5ebdb75f0812b364e9f0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghadrar \
noto-sans-tifinaghadrar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
