SUMMARY = "Noto Nandinagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nandinagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nandinagari-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c70d5b008b117863b1143bba8038d79a67bf8057a018c95cb6a33d3a921c9c3144b0c7036b08019a0f6ef8c71e30511793495743b91f84fae74c7552cd0a7ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nandinagari \
noto-sans-nandinagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
