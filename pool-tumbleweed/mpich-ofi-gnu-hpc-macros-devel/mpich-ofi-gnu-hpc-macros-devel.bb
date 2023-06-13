SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-macros-devel provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-macros-devel-4.0.2-3.3.noarch.rpm"
RPM_HASH = "7a2ed79e6d14eb43b41223ebdae1a1248fb50e82621945f55db7d1e72a004c57c13b9d77426165535281ba4adfb581012a974fdd715e2069010d9cc755448f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mpich-ofi_4_0_2-gnu-hpc-macros-devel"

inherit rpm
