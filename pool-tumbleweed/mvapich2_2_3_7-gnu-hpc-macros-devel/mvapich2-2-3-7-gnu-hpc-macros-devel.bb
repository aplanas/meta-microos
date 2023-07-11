SUMMARY = "OSU MVAPICH2 MPI package - HPC build macros"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-macros-devel-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "308de723d627f08a254060a1e743d10a83520867f923ec4f70eac67a65b332d18bc501c83663267c3ef887cbf884500a2bfb556729d1c77e3523309e306d7805"

RPROVIDES:${PN} += "config-mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-hpc-macros-devel \
rpm-macro-hpc-mvapich2-init \
rpm-macro-hpc-mvapich2-requires \
rpm-macro-hpc-mvapich2-requires-devel \
rpm-macro-hpc-setup-mvapich2"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
