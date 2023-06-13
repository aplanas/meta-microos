SUMMARY = "Noto Sans Japanese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-mono-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "24ff7dc87e07619114c90aa9656d4683a3689490f834796c73ef02d68a40504adaabe7a0bd4d5d1fc4177d1459ac579be751e3f252a82759f0d2807f102c9add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-mono-fonts \
noto-sans-jp-mono-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
