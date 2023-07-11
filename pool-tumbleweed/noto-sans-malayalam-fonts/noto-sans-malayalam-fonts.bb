SUMMARY = "Noto Malayalam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-malayalam-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ea02a213cb78e5cc243c901d2b6231f2aad457b4eb514e334ffb80312bb99259257887d24f90bdc8f5f527490f8f07478efe21240b53286d7ce1f16efcd746a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-malayalam \
noto-sans-malayalam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
