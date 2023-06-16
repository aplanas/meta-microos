SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medium weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-medium-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "432e7bb75391ba99b92397c2c578a8c238af13153cf8bacc10f047da60f4b6bbfe31eb30cc354857624f9585fe5e97862ff69ae7e7d9e7da3307efbd6a0b9c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-medium-fonts \
noto-serif-hk-medium-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
