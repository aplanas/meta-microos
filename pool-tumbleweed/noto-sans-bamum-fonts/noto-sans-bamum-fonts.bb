SUMMARY = "Noto Bamum Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bamum Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bamum-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "567949bae3df00f478f003ec59f25d95d8c948c73876fbb571d9069438108e30c291f5a64332ca94a1274e0c84bb26d53128fc3ef577a66163427bd60c14f541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bamum \
noto-sans-bamum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
