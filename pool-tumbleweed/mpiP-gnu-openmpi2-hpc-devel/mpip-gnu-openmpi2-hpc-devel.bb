SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-devel-3.5-3.4.noarch.rpm"
RPM_HASH = "f89fe9836aadbe07ab3b6900f60cb4f471133adbfe6e46506c0240808947a7ee377545c3ff6783324a9462321ee5a3d01875d35bca4f6b012a281d85799a0b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi2-hpc-devel"

inherit rpm
