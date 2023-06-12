SUMMARY = "Noto Devanagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-devanagari-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "a2992e6b3ab44e4edae261d40196fa9ef207b33b4f466d84d0fdf45b8367da2e8d42350c6fd6951748654cda4e70d2240dcb61d1c3a0a16044f035171d66f06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-devanagari-ui \
noto-sans-devanagari-ui-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
