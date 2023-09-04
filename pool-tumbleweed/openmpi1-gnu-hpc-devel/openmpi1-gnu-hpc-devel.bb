SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-1.10.7-8.1.noarch.rpm"
RPM_HASH = "0823192eabec92487703a580e3214532fc14352e2311e24aa62c7e3a513b01800463f683bc6b93ea7952f48969bcab8530b04967fefa66a9e4cb43eff148611c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
