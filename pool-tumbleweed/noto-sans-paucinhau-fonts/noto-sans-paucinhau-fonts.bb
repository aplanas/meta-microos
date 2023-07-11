SUMMARY = "Noto Pau Cin Hau Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PauCinHau Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-paucinhau-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3960abae72ebed47d1c9dcb791a97005b30e685dfb351aba1d55675e80059041003ada12f14f46700a6b17a53216e9a04e838a935c9386452f31de711e050513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-paucinhau \
noto-sans-paucinhau-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
