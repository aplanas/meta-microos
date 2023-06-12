SUMMARY = "Noto Hebrew Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-hebrew-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6948e962fb05213cbbc5ab3953009a1e0a8a483d32d1740e04a615d4a487795e9a4135405c9298e56344eaba6fd37e5660a5d2800b17be37d26af894062fdf81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-hebrew \
noto-serif-hebrew-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
