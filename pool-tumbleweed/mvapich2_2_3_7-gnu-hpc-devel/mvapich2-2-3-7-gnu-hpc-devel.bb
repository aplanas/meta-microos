SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "196b4a2daf90596395dcdc263b6526bbdb7339452de91b16d313697640e5831cd88f8019a96ae1f1ff59bf51f1ade06952ea5dd3b611ebdc16c7be32e02e15c0"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhwloc.so.15 \
libibmad.so.5 \
libibumad-devel \
libibumad.so.3 \
libibverbs-devel \
libibverbs.so.1 \
libm.so.6 \
librdmacm-devel \
librdmacm.so.1 \
libstdc++.so.6 \
mvapich2-2-3-7-gnu-hpc"

inherit rpm
