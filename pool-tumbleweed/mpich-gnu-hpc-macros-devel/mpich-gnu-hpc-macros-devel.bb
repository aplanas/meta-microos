SUMMARY = "Dependency package for mpich_4_1_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-macros-devel provides the dependency to get binary package mpich_4_1_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-gnu-hpc-macros-devel-4.1.2-1.1.noarch.rpm"
RPM_HASH = "450ed923098cde3a295d7459c88312f271edaa019cce8bd16ca9ffb98a82b5b40b3fadcf376904ab8fe133ad86e65edd359362a177afb30fea654de2f7ae43d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mpich-4-1-2-gnu-hpc-macros-devel"

inherit rpm
