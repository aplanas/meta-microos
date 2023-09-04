SUMMARY = "Dependency package for openmpi_4_1_5-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel provides the dependency to get binary package openmpi_4_1_5-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-gnu-hpc-devel-4.1.5-2.1.noarch.rpm"
RPM_HASH = "1a74219eaffc89462371104c2fab987617e1ec79feeda31d72cddaee07a8d2b49b03de4abe7c2927b4dbf6a3f5ab952f28eeba128a5c277ea5eb98ea100e8d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-devel"

inherit rpm
