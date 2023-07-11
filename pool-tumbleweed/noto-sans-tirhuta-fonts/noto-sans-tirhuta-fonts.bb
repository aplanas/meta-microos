SUMMARY = "Noto Tirhuta Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tirhuta Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tirhuta-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c9f7b7de53073355b0ea7bc391d1040c017a07216712fce8fdfb4065fc9d1459539e8be0edc7db73fac5bf032868b9f6ae792180fd2cfb98b0cdee6db1c55268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tirhuta \
noto-sans-tirhuta-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
