SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bold weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-bold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "1908f3ad9843b777e8f15409915d665fb8ea1eed20cb9284a5dc4ba22c5e0017fa272e172ab0bde24ab658aa216efa35d890cf18a02f3497b131cc67e7385166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-bold-fonts \
noto-serif-hk-bold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
