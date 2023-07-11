SUMMARY = "Noto Tifinagh Air Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAir Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghair-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "82d08fe1c52badbfeeb1dc6589719c45f487311d8eb0e9eb776a7c5c3434945fa81bf1f157fb4e61bc8ee54e5511c9d20b2dd95f34b197d1dc58180936657eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghair \
noto-sans-tifinaghair-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
