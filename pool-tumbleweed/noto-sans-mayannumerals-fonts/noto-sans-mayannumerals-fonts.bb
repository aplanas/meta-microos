SUMMARY = "Noto Mayan Numerals Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MayanNumerals Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mayannumerals-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "23bdbee36a0cbd991d46bc04f6a02c299b0fc6281e4baa300c03317327bfd7b1fb735a26720336ba5999be9365ece9bc4c400180c3556d0c7d6a78a8c1ab1725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mayannumerals \
noto-sans-mayannumerals-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
