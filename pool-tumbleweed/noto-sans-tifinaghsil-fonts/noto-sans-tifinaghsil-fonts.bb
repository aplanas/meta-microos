SUMMARY = "Noto Tifinagh SIL Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghSIL Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghsil-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2afbea8d9a73d5a74d725c2af277c860c9c6a0f07bdd00d8c6d7438c84c3a962bbb28ec36296806849b2ffe341e4a980317ede574d7398f375265bdfb0c0af66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghsil \
noto-sans-tifinaghsil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
