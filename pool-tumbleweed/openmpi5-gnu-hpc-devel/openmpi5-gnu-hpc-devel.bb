SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-5.0.0-4.1.noarch.rpm"
RPM_HASH = "de4fbe5571d9995f85cf7c29707bfd2b61ccd9794762eb06777f4eb1965476f8c7480c2f992b7893be9596750a279e41ddecb06e702dd5c4b7087677be69672f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
