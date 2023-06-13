SUMMARY = "Noto Shavian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Shavian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-shavian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c69cd92c0dcfef5523face752671e257d2e91ee0916b3407683870c90ed1887e29b84de9908a6a19ae1b610f28d3b44a1fb105584e453ac7f74ff2d170fa2650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-shavian \
noto-sans-shavian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
