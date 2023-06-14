SUMMARY = "Noto Tifinagh APT Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAPT Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghapt-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "012ccfc9cc05c3bca3a94fb1f358540d5ebf968cce23c87c3d3528d02e980a96245397107fcc311b1bdb5fb172eae2185c5c13656b56ea73859dbf953857c921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghapt \
noto-sans-tifinaghapt-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
