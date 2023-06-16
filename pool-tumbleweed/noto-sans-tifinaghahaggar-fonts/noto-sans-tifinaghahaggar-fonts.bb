SUMMARY = "Noto Tifinagh Ahaggar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAhaggar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghahaggar-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5836afdae5404407231ee8382a81a466e48d80af16fa2c37c6c9d08af31967a3939e07aebd361e3485b087b3eadc9e226256a6e2766cd8be816b63a9969ef8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghahaggar \
noto-sans-tifinaghahaggar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
