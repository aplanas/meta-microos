SUMMARY = "Noto Takri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Takri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-takri-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "de2be7a03eafbda8a9fcc68dedae3e592036d81f9f09859545c10c054e630a1e24b40c20b6b38c5cf2dcc405a0305e76bbfdbcfd29c6755ccad8249f26c9cc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-takri \
noto-sans-takri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
