SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel-static provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-static-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "8025327c0a9ef08a11405c616e3d9127ea27207828b7314c75da53314b28124a192eb76d647e86a2dc9d79c024364941541fb6c0c0cabec473332c4946bfacd2"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel-static"

inherit rpm
