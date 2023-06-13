SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-docs provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-docs-3.1.6-7.2.noarch.rpm"
RPM_HASH = "f98da41f3e125ab2dbc3689e86818905105ab2d063b8ac8763fb65e3ffc83eae8ea568d3599bfebc1896f4d3065f26d85dfb261cc946350e2ab554add08ccd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi_3_1_6-gnu-hpc-docs"

inherit rpm
