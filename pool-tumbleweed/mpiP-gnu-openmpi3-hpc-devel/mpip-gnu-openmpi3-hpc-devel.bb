SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "32266866627736fb4638031a3b57f466d267fee74e841067bea4587f88306c13df1e06d4e124be80ebb67bf1f9041d947d3d6886b94c5e3587304f53733635f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel"

inherit rpm
