SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-macros-devel-2.1.6-14.3.noarch.rpm"
RPM_HASH = "119923f7d4acf1d25e9818062c15d9ece2b892c792c078520a01b9213654d76bcbad047400d02b72bd3ec970b0ad40829010d7b74357104adeaec177aa4c2925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-macros-devel"

inherit rpm
