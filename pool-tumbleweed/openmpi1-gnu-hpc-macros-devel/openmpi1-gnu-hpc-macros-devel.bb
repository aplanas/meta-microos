SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-macros-devel-1.10.7-7.6.noarch.rpm"
RPM_HASH = "2914dd0fccb5d1a252729615d4e305e69377e96b038f2e1d1a24669d7c3c50af74ebea0130870728944843a45495e99947804f57cb9e2d6241069c4d78312a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-macros-devel"

inherit rpm
