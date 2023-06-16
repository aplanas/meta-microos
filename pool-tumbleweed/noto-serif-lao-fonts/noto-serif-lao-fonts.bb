SUMMARY = "Noto Lao Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-lao-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "38750a5c764e88e527bf602d5d429f6f5cb99895b92e0366b81ef27b6d0808eac7f72b5ee76d9c51e50a2cadf44284aaa1587e0ae6d36ef700539189975876c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-lao \
noto-serif-lao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
