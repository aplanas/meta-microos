SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-2.1.6-14.4.noarch.rpm"
RPM_HASH = "241d9a381eca94674592ea684a86df56ff8ba03cb22cc2ce26bef16b39b7bc5b1d80ce867dcf8faace7feedcd8f38990ced9bd3a2a672904ee8e1b3edafbeffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
