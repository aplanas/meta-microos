SUMMARY = "Dependency package for openmpi_4_1_5-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel-static provides the dependency to get binary package openmpi_4_1_5-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-gnu-hpc-devel-static-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "1ac6f1239158458b966db7b706b520dcd83e2bf1e8d1b839b3835678a5fde2e834ff95bd5a788a54b22cab40e3e4f8ac1c09f8781e352ced7e0d9ac5e18f5446"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-devel-static"

inherit rpm
