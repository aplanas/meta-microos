SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "f22b4098146362e282a5cf6741c5bfe67e2f273d489f2ddf4b1aa8e2a04b37a1a3a63d1952061e06d78663a945c8449f6a68621830cb6f6dbc31a9c286fd9b76"

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
