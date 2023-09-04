SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-2.1.6-15.1.noarch.rpm"
RPM_HASH = "681ee4b5355ab0f7041d67267d64440dc525d35c4494c7866b5d581715e3d26bdf7471d461c5c5d9f162b64cf9bd23070fa46aeaf283ac2c44746b5aa3733b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
