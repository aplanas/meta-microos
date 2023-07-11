SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-5.0.0-2.4.noarch.rpm"
RPM_HASH = "d10a2a52ea97475805141777ee15c324af631646be43136af24588552aa8903ef423e142e4d05e80043730f361bf8b8d29c26dafec3106fd9141bf6ce645a2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
