SUMMARY = "Noto Hebrew Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrew-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6b1bafb7a5fba08cdbe85ce05fae82b1bdd82c4020e2f235ca72852ffbc8b63a6ba4b4e01aa373b2933860de128862c13a6c38b625e8409dffcf57f523ee49f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrew \
noto-sans-hebrew-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
