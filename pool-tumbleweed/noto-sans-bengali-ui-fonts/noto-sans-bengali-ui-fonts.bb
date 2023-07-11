SUMMARY = "Noto Bengali Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bengali-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0a4041585311ce05167717b50f831f1b56a61a1a93f9fe7b3f6d3366c2f41eb37f56194fd6ad41885683df974ad0c7bc8c99d0699250ab64c7c1a162510ae9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bengali-ui \
noto-sans-bengali-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
