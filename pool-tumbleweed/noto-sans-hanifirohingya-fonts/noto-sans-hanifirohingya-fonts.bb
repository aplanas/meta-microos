SUMMARY = "Noto Hanifi Rohingya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HanifiRohingya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hanifirohingya-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "604ab3b2d2ed28e416366e94e8f0cede747a835c6b905a6d8dc746314947014e615d97d68b255cbec281b28e027028e5e970ae71080a4a0e81877c9440e6acd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hanifirohingya \
noto-sans-hanifirohingya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
