SUMMARY = "Data files for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains data files for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-data-2023-1.1.noarch.rpm"
RPM_HASH = "72c30afe85f0494ef3700e0e5ecbd8d027211f9cf5ebabfe710c5d07aecace0a3b0a0e2edce2db67ea52880c8f58191d3fb06b7d98b429e48a212c61b9d32f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-data \
gromacs:/usr/share/gromacs/README.tutor"

RDEPENDS:${PN} += ""

inherit rpm
