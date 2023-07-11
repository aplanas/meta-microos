SUMMARY = "Noto Palmyrene Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Palmyrene Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-palmyrene-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d66b052b6e95a14e26bf2f7d172cfc8d75984f6b6a71fb5f29d7746d4c2a4ac1e2c84c7c8959d4b8faae07e78aaad47962ac3927134808116479ce15f524d751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-palmyrene \
noto-sans-palmyrene-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
