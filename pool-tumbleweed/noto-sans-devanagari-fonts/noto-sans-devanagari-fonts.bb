SUMMARY = "Noto Devanagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-devanagari-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dc3aea0e2340a5fbf08e5a17b5d10d6971635b065419e840019d9ff1b30f6bd0c2160f66ecd01d4be1e9f2c6d7873fd64021187ed4e54fe89f2d1abe20bb5440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-devanagari \
noto-sans-devanagari-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
