SUMMARY = "Noto Khmer Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khmer-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "729e510d95166364aa40713460a2bb649d0c76493eb54dd483f4f0d12e6c489085b07f11ba4bf04baef48c637d7aff3218ea020c7745e1192627419507f23986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khmer-ui \
noto-sans-khmer-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
