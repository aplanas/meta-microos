SUMMARY = "Noto Gujarati Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gujarati-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c13704eaef4faefb9042555dbcad99c57c67522537f75ffdbbc6d396158f6cc5052544f80420039e0d40c2485d1822ada938b3eb1add242f586d7ed35803a4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gujarati \
noto-sans-gujarati-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
