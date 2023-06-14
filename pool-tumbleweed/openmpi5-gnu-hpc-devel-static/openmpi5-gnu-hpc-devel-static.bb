SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel-static provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-static-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "671507fa03b657d4bd89338eef77a5d4777d328e5f567e32115c14919294717a7ea21f8f03de078accbe58277f0db1eb0f4bc50ff92faebc7c23e3fefe7de8cb"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

inherit rpm
