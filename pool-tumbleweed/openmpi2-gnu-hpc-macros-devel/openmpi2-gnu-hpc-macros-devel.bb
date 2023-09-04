SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-macros-devel-2.1.6-15.1.noarch.rpm"
RPM_HASH = "438aecc0348bc39d4d6c185391eba61576fb95979f2d77fa2cb32ce3dfd95259e9ab039eba9201a02b297e94a09f8b062c8b9ec00685d6aa6583f912c349a6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-macros-devel"

inherit rpm
