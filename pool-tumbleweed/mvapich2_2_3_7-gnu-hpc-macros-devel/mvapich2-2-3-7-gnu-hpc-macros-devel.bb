SUMMARY = "OSU MVAPICH2 MPI package - HPC build macros"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-macros-devel-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "c6a3c0f92afd616f7327c8c04fd1648f0e0774f26f400eb9507e00b233c1841ebe248b387ba444084de7d648fefbcc8c6a6e25a15572fe0282f62039281bbbba"

RPROVIDES:${PN} += "config-mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-hpc-macros-devel \
rpm-macro-hpc-mvapich2-init \
rpm-macro-hpc-mvapich2-requires \
rpm-macro-hpc-mvapich2-requires-devel \
rpm-macro-hpc-setup-mvapich2"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
