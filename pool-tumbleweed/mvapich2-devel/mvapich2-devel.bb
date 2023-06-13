SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "727fa5d0e0c9d047c9d473d5bf63ac3a52e445d9324cfc7658e4ccefc3ec97e4e4a6e973a2f6157e0125d67225874bc1c8fa0b59899ffd5a0f098ee087ffeec5"

RPROVIDES:${PN} += "mvapich2-devel \
mvapich2-devel(aarch-64)"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
mvapich2"

inherit rpm
