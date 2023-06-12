SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "f461e5b57ea078803106576f9721f0f6bf61def173c632d886316cb79a93a555111936aa5c293ef4450cd00a222e167ca78762151358a45d1abc4bebdcdd0586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc-devel"
RDEPENDS:${PN} += "mpiP_3_5-gnu-openmpi2-hpc-devel"

inherit rpm
