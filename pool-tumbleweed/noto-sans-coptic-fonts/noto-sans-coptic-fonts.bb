SUMMARY = "Noto Coptic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Coptic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-coptic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "13c70077ddeb23e235a04f67c5f35a19fa6cda5667141f805de67cd10ed04647a465ee0825d3518c1781e66d17fc277d875990abefb86dc586a9d79d5012b560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-coptic \
noto-sans-coptic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
