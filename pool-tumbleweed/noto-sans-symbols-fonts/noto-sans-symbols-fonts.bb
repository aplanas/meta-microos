SUMMARY = "Noto Symbols Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-symbols-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b36d17fef380b40f1e5814fad5e1a492548a693b4d843484a77389a0190774ec40f955ba5d8f4c3a9b0de6216c9f563a8026a6732e3afc4c2984177b9db00743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-symbols \
noto-sans-symbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
