SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel-static provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-static-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "5903c2c30964e7a1adc737481a65b98e48018b010679b21dd88c3f92a3d00373c2f513da5e7fc94bc37801ae4cda713f7c484917a27d4d4d6860dc86a372e330"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

inherit rpm
