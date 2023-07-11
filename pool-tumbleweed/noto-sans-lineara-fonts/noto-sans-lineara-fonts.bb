SUMMARY = "Noto Linear A Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearA Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lineara-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9cf13aeb6ba283c756032d224cdcb805bbc1daef170e4fb542ad342974547488cb35f65641af3c3343520d32639a7c93398d933699bc4172cc6220fcc323cfff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lineara \
noto-sans-lineara-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
