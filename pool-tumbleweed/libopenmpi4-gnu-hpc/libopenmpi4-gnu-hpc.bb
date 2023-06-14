SUMMARY = "Dependency package for libopenmpi_4_1_4-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package libopenmpi4-gnu-hpc provides the dependency to get binary package libopenmpi_4_1_4-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "libopenmpi4-gnu-hpc-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "ee675644e4e610a7b9310c8c3669e30164aa272ddeee1d47677d9369883209520954604ecd6827981a4916c57fa7db2f562749128e8f6fedce5c9d1205a5393d"

RPROVIDES:${PN} += "libopenmpi4-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-4-1-4-gnu-hpc"

inherit rpm
