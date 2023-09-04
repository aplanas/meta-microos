SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-macros-devel-5.0.0-4.1.noarch.rpm"
RPM_HASH = "e2322a3646f5f9fabbb4f7f1464fd0d1746232af0d57fa043db09531867d2e7791efe4e236c5bef7c18e85dd3cd396f4c2d128dfdf88e3674e9a8e50165193a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel"

inherit rpm
