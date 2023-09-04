SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel-static provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-static-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "41ff4a4546183ac1887fddd109be83c947efff1305223961f21dfecfcd0cf8702df6d76e0483bc4a38d5d85545694094beffa159dd8a2ac2c09de755d7a92c4e"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel-static"

inherit rpm
