SUMMARY = "Noto Khudawadi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khudawadi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khudawadi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3e641acaab679f4e90dcdbfe3b7b4d034543e19f855a90c9a2e43d3fe3e5af7b8ab391d919db772af0b167790283dfda3ee69a617f8ea51dcfe542743e05750b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khudawadi \
noto-sans-khudawadi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
