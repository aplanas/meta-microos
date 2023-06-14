SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel-static provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-static-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "f5e987194c5892ae849ab295a8ccb651539d72c22e5467cb839c634647adc6b281a12c117e8b2d1bbfd8686f1082a90f2fd92981674aa14535f123e13ac75af5"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel-static"

inherit rpm
