SUMMARY = "Noto Thaana Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thaana Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thaana-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "393e74d1889a038e0e9ab9a96c183e5dbf9571eddc1bd0e500ad819b014ea7d14015390f77dab8156d0be6d6af732510fe0b47d3b5b75e8d72d541c22aa78707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thaana \
noto-sans-thaana-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
