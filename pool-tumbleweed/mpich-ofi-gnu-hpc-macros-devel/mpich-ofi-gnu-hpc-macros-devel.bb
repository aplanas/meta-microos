SUMMARY = "Dependency package for mpich-ofi_4_1_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-macros-devel provides the dependency to get binary package mpich-ofi_4_1_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi-gnu-hpc-macros-devel-4.1.2-1.1.noarch.rpm"
RPM_HASH = "d850e937ec8a14910f0b71fd7e307ea246632a099363055d101c75dbe9e39a3bbf732d5ee5ed0eb6309e20569e22e7e00910dda75830f63b97888866ee355c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mpich-ofi-4-1-2-gnu-hpc-macros-devel"

inherit rpm
