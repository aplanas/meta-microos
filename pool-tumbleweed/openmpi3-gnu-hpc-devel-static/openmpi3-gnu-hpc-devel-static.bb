SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel-static provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-static-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "d8bb8a4bc342f6bc64b34df7b662ba562f704e70adfd6e50537804c19a290cf293d5c18cd2460826eefcbce7fc6852c4bfbd3b2dc14d688b8ee454f19f899c8a"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel-static"

inherit rpm
