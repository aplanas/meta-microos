SUMMARY = "Dependency package for libopenmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package libopenmpi5-gnu-hpc provides the dependency to get binary package libopenmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "libopenmpi5-gnu-hpc-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "124bd0a7983ad1adbaa820cc21333c0f4ba859a5c3978288bb891b8d60216d5c0a3613802de485189bfbd2a71c5e9377c82ccf658c82338dd8ddcf54568c5596"

RPROVIDES:${PN} += "libopenmpi5-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-5-0-0-gnu-hpc"

inherit rpm
