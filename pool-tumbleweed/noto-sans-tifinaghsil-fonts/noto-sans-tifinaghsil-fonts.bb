SUMMARY = "Noto Tifinagh SIL Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghSIL Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghsil-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "efc35cb9f4ccaca2a92c4da21b1ca0f8ed012ecbd0f8404088734a36987d046ab428d71a88160e090bab1c5ee2ef5eeab9c2cc742154bea04cecc6c825e8cd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghsil \
noto-sans-tifinaghsil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
