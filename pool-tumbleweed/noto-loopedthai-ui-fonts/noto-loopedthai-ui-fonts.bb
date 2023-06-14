SUMMARY = "Noto Looped Thai Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedThai font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedthai-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "33c48ece638d10f16673e72e3b93da6daa2c94bd28b9f8edd773b8807d07478ba05c5aa5aa1bd1eda294d40d2b6a122401824c1388fb52aa27415fa9c94fdfe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedthai-ui \
noto-loopedthai-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
