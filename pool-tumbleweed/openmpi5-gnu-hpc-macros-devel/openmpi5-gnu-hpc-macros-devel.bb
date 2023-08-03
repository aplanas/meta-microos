SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-macros-devel-5.0.0-3.1.noarch.rpm"
RPM_HASH = "eb41d23859d4bdcfbcff2aa1555b93269ae13353fec2e83e9f722821c120bdf3117d608db3d4408e8b75941e0983dea69c99678767541d921bd5e88cf30a93f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel"

inherit rpm
