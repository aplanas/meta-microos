SUMMARY = "Noto Anatolian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AnatolianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-anatolianhieroglyphs-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "558d36a7b474f15ae5724ef4ec1505fd798088c618276c3bf88de5ba1aaf4d032fe70b6151529fa4221c391a0320b826df489192b186c6efc5d59d033bd60422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-anatolianhieroglyphs \
noto-sans-anatolianhieroglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
