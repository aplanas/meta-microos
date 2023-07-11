SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-devel-static-3.5-3.4.aarch64.rpm"
RPM_HASH = "f6181af1816a44aa4f4f44adbcc51dd139f242dc7fae092215d2e1788701b11165cf0102b0f65c6fb68a06972f3a582c9d2a7a761f877027dc841b4026fc2ba8"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mpich-gnu-hpc-devel"

inherit rpm
