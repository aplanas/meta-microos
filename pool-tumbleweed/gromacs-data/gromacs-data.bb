SUMMARY = "Data files for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains data files for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-data-2023-1.2.noarch.rpm"
RPM_HASH = "054d4d9074e76ae5cc76581ca042902a30b45c5a87d70597ea4838dd2bffe7687a93c187684342b29c8bf10bc958e0556c9a5646e704980048ae8dc1d3997fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-/usr/share/gromacs/README.tutor \
gromacs-data"

RDEPENDS:${PN} += ""

inherit rpm
