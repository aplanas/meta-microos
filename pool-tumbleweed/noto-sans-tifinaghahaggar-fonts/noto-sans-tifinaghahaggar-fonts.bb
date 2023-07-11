SUMMARY = "Noto Tifinagh Ahaggar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAhaggar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghahaggar-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "610335d209f80aa9179417357b5372a5cf795edda47e4d7f8848e50bd93f65013eb71a46e3d157dd8eb5a0fe6b517108da698ef8b337a747cd789e9c64851ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghahaggar \
noto-sans-tifinaghahaggar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
