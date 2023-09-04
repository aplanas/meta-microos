SUMMARY = "Dependency package for openmpi_4_1_5-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_4_1_5-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-gnu-hpc-macros-devel-4.1.5-2.1.noarch.rpm"
RPM_HASH = "59fda3adb46df6b10709e303739b54197ec74fc3ea037bf9bcc8462420521fafe466c887c9627ffc2d62b3c7321d381551983dc1ec3d73e9e059e1cd4d1073de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-macros-devel"

inherit rpm
