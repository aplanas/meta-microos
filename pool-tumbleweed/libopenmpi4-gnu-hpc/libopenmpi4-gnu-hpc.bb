SUMMARY = "Dependency package for libopenmpi_4_1_4-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package libopenmpi4-gnu-hpc provides the dependency to get binary package libopenmpi_4_1_4-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "libopenmpi4-gnu-hpc-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "563221d9f5c18ffe4d13b906b5e48facf9e8a1b472fd026f0d3059d46c04964bbaa312b10d92ddad33cc1e61de2bac3962314d4040aa4deb82937450e7f873b3"

RPROVIDES:${PN} += "libopenmpi4-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-4-1-4-gnu-hpc"

inherit rpm
