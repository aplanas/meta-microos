SUMMARY = "Documentation for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains documentation for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-doc-2023-1.1.noarch.rpm"
RPM_HASH = "e0039e9213772b2050d8c449ad8f8ff45bd27ac0a44669fdda5930f6b0a6edca849b64e5847f580e5936cb1d1a64a79dbe21ddd7e43750946596ff9372781092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-doc"

RDEPENDS:${PN} += ""

inherit rpm
