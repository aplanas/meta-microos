SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-doc-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "b29678bfcd2ec142798ac333c7117f224d116a8a20927734b53595a3693e5d60bf7e3fd37ab53dc2b29f20775f857abe1e91fc9defb4642d4c344bb20a469aa9"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc-doc"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc"

inherit rpm
