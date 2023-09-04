SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "26364e20958303af0b9676b5d57075ca6bdbe137159a24e37ad4d9a5e8c055a1eed7fbc730f2c15862e6c3886976a19d11aa2671b7ae4046bf5aa7bd30755c39"

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
