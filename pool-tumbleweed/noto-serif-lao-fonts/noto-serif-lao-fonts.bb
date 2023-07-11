SUMMARY = "Noto Lao Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-lao-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "bcd81901a538184ac0a55c82332e1c0b5285874d3518b4f142370c5caf5dc2a6e0af67052457252c1d907227ac6bf9bf0d3f51bd83b64f54d7d5113427b5c6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-lao \
noto-serif-lao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
