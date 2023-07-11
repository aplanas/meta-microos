SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-macros-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-macros-devel provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-macros-devel-4.0.2-3.4.noarch.rpm"
RPM_HASH = "580f85f136a027292a3cd3b9fa4b484eb0e72d252651820a94677ebabf41e39266b24f34952e2f28281c29d4670f4482573ab78195211f744d242b2d533de472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mpich-ofi-4-0-2-gnu-hpc-macros-devel"

inherit rpm
