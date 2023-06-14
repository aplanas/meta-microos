SUMMARY = "Noto Sinhala Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-sinhala-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "488fbc045599c5ae88dfc066e64f9360736c41a3cd15d1913cb892ab624ec3547abd8347ea439e66d7675df3dda6e04b5416028aab897ca02a646ba92c460ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-sinhala \
noto-serif-sinhala-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
