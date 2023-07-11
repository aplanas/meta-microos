SUMMARY = "Dependency package for libopenmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi2-gnu-hpc provides the dependency to get binary package libopenmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "libopenmpi2-gnu-hpc-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "46bf91a6d22553b7718bb5cff63981fef28708c6a686c07d10b9a627959140e3e97dc8022d3b2c83dcbb506168d436a0e15e79475f6139c1262ce31f03ebb4fb"

RPROVIDES:${PN} += "libopenmpi2-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-2-1-6-gnu-hpc"

inherit rpm
