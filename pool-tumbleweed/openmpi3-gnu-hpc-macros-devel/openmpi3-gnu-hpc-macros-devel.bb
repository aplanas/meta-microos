SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-macros-devel-3.1.6-7.2.noarch.rpm"
RPM_HASH = "fd24883cec12932cf9396c2830cedd496dab03d2d7316e911fa8a76f3425b8a7dbc19acc9896e6fd5f08f5590758be4c023223ea739ca82f890fd2c23030368f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi_3_1_6-gnu-hpc-macros-devel"

inherit rpm
