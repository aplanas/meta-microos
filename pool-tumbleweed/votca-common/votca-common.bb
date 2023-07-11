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

RPM_NAME = "votca-common-2022.1-3.7.noarch.rpm"
RPM_HASH = "07def071100f4053130c098a95d264ea9659de4947603d9cb43df2548ea00e5275bbab77f9f346b4afe3c2761b2b5e81f0c224cb16ea16a32c68405585734634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CsgFunctions \
perl-CsgSimplex \
votca-common \
votca-csg-common \
votca-xtp-common"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
bash \
perl"

inherit rpm
