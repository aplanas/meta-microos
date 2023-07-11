SUMMARY = "Noto Khojki Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-khojki-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "33c800aed291a0e17ae7421e6704319e2ab9b9c3bc2ac6fb2d15de9cddef268ad3d1df60f06366e629fe7b5f698eacd194b5d58998b799f4d1e0de78dd57a6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-khojki \
noto-serif-khojki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
