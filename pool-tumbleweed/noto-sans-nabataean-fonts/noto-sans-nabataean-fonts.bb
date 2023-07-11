SUMMARY = "Noto Nabataean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nabataean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nabataean-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "354fc8a0f47952e9d6860f782e90850fa012ec53b7809deaac7b696cb30e719fcc329ea484de7ac9641bfbc990f738ec16aeac5ef0b0c16994a42bec279bf91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nabataean \
noto-sans-nabataean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
