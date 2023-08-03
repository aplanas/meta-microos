SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-5.0.0-3.1.noarch.rpm"
RPM_HASH = "6b6d8d4724827fc5bf63071a827ad0b7551a4231ba397b78c767ab6a18f22ade7dbf47ee96012add66224f2ce43c9d6df1e2dc5fa957863931e023f8b7ee26df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
