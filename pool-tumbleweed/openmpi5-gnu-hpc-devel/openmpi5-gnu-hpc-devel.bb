SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-5.0.0-2.3.noarch.rpm"
RPM_HASH = "a740c6f33e8d4f02213a39ae7cd13fef61d98e5f2c0040e268b30328be485113755f4c111e68187e772968098ba10df72336278d013c5e20b467ac1b5a518c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel"
RDEPENDS:${PN} += "openmpi_5_0_0-gnu-hpc-devel"

inherit rpm
