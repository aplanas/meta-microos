SUMMARY = "Noto Mono Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mono Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mono-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6120c470421a9a6ab71e20476afafe1bb1fe774135b26934fe61adaa219c9c89573f7e873fdc93d27ae364ab891304879710c6be500f030042534a38ad692dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-mono \
noto-mono-fonts \
noto-sans-mono \
noto-sans-mono-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
