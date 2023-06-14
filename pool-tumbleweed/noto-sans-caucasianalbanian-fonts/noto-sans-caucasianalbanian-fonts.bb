SUMMARY = "Noto Caucasian Albanian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CaucasianAlbanian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-caucasianalbanian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c94c0c04eff88bf57c0fe3380ea03733daa7bdf23f46ec232a9b2ab2c86ea83a87f232c8fdc2219165e2abcbe1a7e0b0199062aba9805a04d35442aa6effcb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-caucasianalbanian \
noto-sans-caucasianalbanian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
