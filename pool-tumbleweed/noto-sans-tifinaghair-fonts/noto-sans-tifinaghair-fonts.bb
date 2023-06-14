SUMMARY = "Noto Tifinagh Air Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAir Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghair-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3010d5bbfe374a49f499e3210fb56af4986d4e13ff2f6a8e9b067eb0c62d75fbdbc1f3d1c3f8994f677afa4293e911843b740f907f84f1977b4bdd2f50a4daf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghair \
noto-sans-tifinaghair-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
