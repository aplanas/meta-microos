SUMMARY = "Noto Serif Japanese Font - SemiBold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SemiBold weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-semibold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "e6443e9f79349b567e30a29872842a773ebca55ac708bb39a06cd3888b407dfb1bef00de81e0f73eb7d30e23dc1ce9a325718fd95e374dbfb8ea2197b2e5866a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-semibold-fonts \
noto-serif-jp-semibold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
