SUMMARY = "Dependency package for libopenmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package libopenmpi5-gnu-hpc provides the dependency to get binary package libopenmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "libopenmpi5-gnu-hpc-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "e444ae64d960b162df128d233c4870249cb1aa4f3023a6c060d82d5cd4e4ef423919c043fd57068129e63debeaddfe8e4324dc43d0ea0d3f08b5779a520b56f0"

RPROVIDES:${PN} += "libopenmpi5-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-5-0-0-gnu-hpc"

inherit rpm
