SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "5904a185ad5acae2eab8429cd6e85079d170cfcf52e7d532ea1122ab2a079c4d55487d09a8e0b3c2c1df18f34d876d5b49c11376480ec187e5a4a92681b816d5"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhwloc.so.15 \
libibmad.so.5 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libnuma.so.1 \
libpciaccess.so.0 \
librdmacm.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
lua-lmod"

inherit rpm
