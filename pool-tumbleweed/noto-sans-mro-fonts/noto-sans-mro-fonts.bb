SUMMARY = "Noto Mro Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mro Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mro-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0c7b5a6ad5f5af250bd1b70eb8589920ddb43df9763a98160b9dc89170d369f13e652ac10a782728a41ce5fc658549a31a5b4c4f7117fbd9fafc04e5321e2077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mro \
noto-sans-mro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
