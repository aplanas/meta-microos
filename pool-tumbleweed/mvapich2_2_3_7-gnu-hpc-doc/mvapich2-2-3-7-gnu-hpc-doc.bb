SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-doc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "caa5baea8e625c62c5d8b36c008b432976bef183e150c85950659dcf6ee38856a0fed7a9023fe71400870edcf34b9d13377409148602bd88d05ea7da7f5c7a41"

RPROVIDES:${PN} += "mvapich2_2_3_7-gnu-hpc-doc \
mvapich2_2_3_7-gnu-hpc-doc(aarch-64)"

RDEPENDS:${PN} += "mvapich2_2_3_7-gnu-hpc"

inherit rpm
