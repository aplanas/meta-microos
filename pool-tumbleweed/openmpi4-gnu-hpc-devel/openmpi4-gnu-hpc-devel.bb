SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-devel-4.1.4-2.3.noarch.rpm"
RPM_HASH = "00dde9f4d309f3251e5feabf444781b0ceea620f09fff44c817c9da9e43101ad6b933d26926e91004b26ccd08b76424fa6016a5341bf6070a647791f5ab44a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-devel"

inherit rpm
