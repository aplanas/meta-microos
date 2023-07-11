SUMMARY = "Noto Buhid Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buhid Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-buhid-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "1930de3097490710665ec54e8442b6a4ee5cbf7bf71307d243fdca4155f1c58958d7930b4e201fff5a279cb4f6edd2f72d859bd973b75a6c32a3523374519591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-buhid \
noto-sans-buhid-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
