SUMMARY = "Noto Caucasian Albanian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CaucasianAlbanian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-caucasianalbanian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2011469ec5d97531becf3e983810eb573f90d7a7e186ae18bd3112e2534ab547159f6974e647cb504f2ad75b87bc1d82d5934f2a682d7216f97a080c61767a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-caucasianalbanian \
noto-sans-caucasianalbanian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
