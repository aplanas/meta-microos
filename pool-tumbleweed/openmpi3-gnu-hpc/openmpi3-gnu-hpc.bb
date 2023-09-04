SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc provides the dependency to get binary package openmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "a8245f6e07d983acab3964fa62eac4a004e6f249887cb7462e8952d15738a7d9187bb4614c7e31e62ee27a8268671a280d9bc42b2be41c0c17dd914565f96e9b"

RPROVIDES:${PN} += "openmpi3-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-3-1-6-gnu-hpc"

inherit rpm
