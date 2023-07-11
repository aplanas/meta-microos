SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-macros-devel-5.0.0-2.4.noarch.rpm"
RPM_HASH = "0f74745ee1ef1ae39620fcc0791da89b50894fd1c605e33802abcd5ef2207ea017789b21cfae06e3be186e3e1e6a5ee774d2a2783afd05cfd4fa08b0a786888d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel"

inherit rpm
