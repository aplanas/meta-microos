SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-macros-devel-5.0.0-2.3.noarch.rpm"
RPM_HASH = "0be61d01885d3feb34c93e6b7ed1b483e53bc32e816112fab356ac14997e796434f153f244a3a186c3c06b9996fa620ca14057ef2307c4b117166d2040173502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi_5_0_0-gnu-hpc-macros-devel"

inherit rpm
