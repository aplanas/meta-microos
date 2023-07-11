SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-macros-devel-4.1.4-2.3.noarch.rpm"
RPM_HASH = "d28ebb7ae33440fcd803bb8ec07cd0c1d10588cfc308c68d43f74c5ca0ca6d7541d19a4969113fd6b7d401b530dc04946f41e5635743969105f60967c5d288a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-macros-devel"

inherit rpm
