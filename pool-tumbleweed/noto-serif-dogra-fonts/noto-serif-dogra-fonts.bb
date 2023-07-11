SUMMARY = "Noto Dogra Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Dogra Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-dogra-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "dc192238d40dfe79383aa2e8cf61f23a29aa3f25090c23a7aa90fc85bd6e11b2f4487ccbc5bc56c2c19aea09086c33f7e1c4623ee9fa4e6521bef4da43c475c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-dogra \
noto-serif-dogra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
