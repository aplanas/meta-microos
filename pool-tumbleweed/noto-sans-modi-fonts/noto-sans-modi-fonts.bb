SUMMARY = "Noto Modi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Modi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-modi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "a5b6d7a9905bc5cad716916cf0eccb506023d9c185850e0335e2d5411e9a470e154053eeeba53f417d8fbeb14038de7a72afba3c4feb4f7dd9c4f49dfce71ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-modi \
noto-sans-modi-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
