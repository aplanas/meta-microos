SUMMARY = "Architecture-independent data files for VOTCA"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the architecture-independent data files for VOTCA."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-common-2022.1-3.6.noarch.rpm"
RPM_HASH = "463bd9cf6bb6474deeccc8a710116b1c7fbdc61879b31c76f9a0aa7e4cb0614aa079a04bfa3281e5517c65b2499543c7bfdc3f1ee8be9cd3844b1b3521606db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CsgFunctions) \
perl(CsgSimplex) \
votca-common \
votca-csg-common \
votca-xtp-common"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/awk \
/usr/bin/perl \
/usr/bin/python3 \
bash \
perl"

inherit rpm
