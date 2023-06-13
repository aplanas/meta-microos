SUMMARY = "Noto Sora Sompeng Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SoraSompeng Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sorasompeng-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2edd134151709982753781d0be7ced33885054c8e4fd28946494b62d635ed711000c2efe70acc9762f7845136b17d71c1f2016d9a0c8f7603d80597cabf2c852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sorasompeng \
noto-sans-sorasompeng-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
