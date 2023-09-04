SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-3.1.6-8.1.noarch.rpm"
RPM_HASH = "3fc0ac116206173f17920c1177fed58ea6a1c8be754a05bf0e5776d3d9113835e080c4326b43cf272ecbcdde7e93485a8dacbcf650374be2e405dc8d746f889e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
