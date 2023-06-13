SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "27ad2bdece62125d4b8b8a92a54cd7bd914fca4ae856f149681ca51003cbc2221c80728316c7e8efe1ae44c0e5f00a262d68fef7ec8319a727a5efb88f51deeb"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc \
mpich-ofi-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
mpich-ofi_4_0_2-gnu-hpc"

inherit rpm
