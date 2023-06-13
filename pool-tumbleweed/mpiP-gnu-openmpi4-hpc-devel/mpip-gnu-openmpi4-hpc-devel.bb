SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-devel-3.5-3.2.noarch.rpm"
RPM_HASH = "0b9b23862821ecec5ee5309e1018c8f670043b515f129047eb77bc494952d22a78b5f8d621f3bdde7a19e208fe98fcc7bcca149e099c1f3511e911a9db46689f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "mpiP_3_5-gnu-openmpi4-hpc-devel"

inherit rpm
