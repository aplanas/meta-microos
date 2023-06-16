SUMMARY = "Noto Cypro Minoan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CyproMinoan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cyprominoan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "93bfd6abd00687878dc0bf399d19f731025c2a0dcb7018982aaddaeeaae41464f1db94588216969b67ee66f48a5709002577fe823bd27f6bbbc0f1a5f32f7618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cyprominoan \
noto-sans-cyprominoan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
