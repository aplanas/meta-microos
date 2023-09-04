SUMMARY = "Dependency package for libopenmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi3-gnu-hpc provides the dependency to get binary package libopenmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "libopenmpi3-gnu-hpc-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "884cfaee29b14f0d3d5bcc2f241699c18beb0d459aafe4ea05f46db45485730c7a3f8b22c7a3790851d706c08d0b5906512c9b97ac9f82f9556b9263c6d01849"

RPROVIDES:${PN} += "libopenmpi3-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-3-1-6-gnu-hpc"

inherit rpm
