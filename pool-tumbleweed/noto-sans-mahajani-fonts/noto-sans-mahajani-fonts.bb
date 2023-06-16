SUMMARY = "Noto Mahajani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mahajani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mahajani-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "d283720350888a046e71973ac859d32ced99c35dbe411dc841fba7c09a27c21d197135bde90818b98874f3113cfa117545a5c0f1fec597c000d1c1d489de30f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mahajani \
noto-sans-mahajani-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
