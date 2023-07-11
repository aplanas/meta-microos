SUMMARY = "Noto Modi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Modi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-modi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "1084711af2d0f5ea6ab2ef6819f91f85ee5728ea75d234c05fcc769a11e64ecf97ff676a5c667c8ef695e537709d77c86efc4f839b838f4c0a6fcf146886245e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-modi \
noto-sans-modi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
