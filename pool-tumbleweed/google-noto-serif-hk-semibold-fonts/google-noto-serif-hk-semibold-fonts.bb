SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - SemiBold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SemiBold weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-semibold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "df7570700d4b584c15db2aa03b211570d1b2179df12fa45b748a41029dc94a56ebbf61e80a4908e65b7664b6f8019aa7d69027f61694d1e50ada7749663ce900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-semibold-fonts \
noto-serif-hk-semibold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
