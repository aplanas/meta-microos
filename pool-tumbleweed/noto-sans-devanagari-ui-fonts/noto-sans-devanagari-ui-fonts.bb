SUMMARY = "Noto Devanagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-devanagari-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "65c9ada7d4f7fef43ad87a708772d6d33c77b222a15f924cdc665dc2059350feb8c8cf2b9ba13217e398d3e2f85ca7c8082b4cfc17ba14e2e5bac56035384901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-devanagari-ui \
noto-sans-devanagari-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
