SUMMARY = "Noto Georgian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-georgian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "36c84e93cb68620e68a48858928f157bdb86707e8047d94b764c821b34adfbbe69df10241a30252f2d89556f23a1d91be0b29512d8ad545b8e8b8108feade051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-georgian \
noto-sans-georgian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
