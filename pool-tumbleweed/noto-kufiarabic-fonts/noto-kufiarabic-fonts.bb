SUMMARY = "Noto Kufi Arabic Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KufiArabic font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-kufiarabic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b5fbb1d762388b7001e37fd7dd1b3ff35bfaf8c46855682a5c0cf4d256e94ece28b47665473e5d93b699a029dc91d27ca627d1d848d755abdd8bf33776194102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-kufiarabic \
noto-kufiarabic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
