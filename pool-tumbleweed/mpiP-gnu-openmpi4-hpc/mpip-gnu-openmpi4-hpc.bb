SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-3.5-3.2.noarch.rpm"
RPM_HASH = "d1bef6d245911142283d3b7a894ee515a71b7f7fdf473c1039700e14b13bc23dc62c7a3dab47ca8ac56f9e6d2c36401ccd8566e7719b1bbbd0bae24d1e53f514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
mpiP_3_5-gnu-openmpi4-hpc"

inherit rpm
