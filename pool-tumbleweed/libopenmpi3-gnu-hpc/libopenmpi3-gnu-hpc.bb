SUMMARY = "Dependency package for libopenmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi3-gnu-hpc provides the dependency to get binary package libopenmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "libopenmpi3-gnu-hpc-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "e6c1a675f8a2c8ea3ee6bd82ab11f9ef55a949a0f1e1e2c6807cbca241297049ca156006f9fceaeb4755f3b0180360fe36ac064ff86ba6721fda63a134674837"

RPROVIDES:${PN} += "libopenmpi3-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-3-1-6-gnu-hpc"

inherit rpm
