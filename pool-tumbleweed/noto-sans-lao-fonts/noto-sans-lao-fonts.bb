SUMMARY = "Noto Lao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lao-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0719d07afe957291146cc0b65b72eb4ca5fce644b17d57c6c018f6c9fe83c8bdea82b653767e2b550a5d8ab9d883626ecd1a1209e2e0f77b492b23e28cd26d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lao \
noto-sans-lao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
