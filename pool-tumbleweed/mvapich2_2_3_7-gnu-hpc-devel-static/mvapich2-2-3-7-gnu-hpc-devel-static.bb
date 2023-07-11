SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-static-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "485a4cab1601f06ac7edae996b293e152d7c22b6a42c06d5194e6fc5cd63953bba4827aa300582ebb7747cbb7bd549d4995399693fee9bd0611e3a70d5d96c5c"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
