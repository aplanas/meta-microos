SUMMARY = "A collection of libraries of numerical algorithms"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This subpackage contains the shared libraries."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi2-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "a0a91dac779f60acf645c6a7a6e6d902a3a220744ce927967197f0c2179ec58f71b662174018fd0d7387b7a24d5df4897d341331b87ba1e892229ac0f157c834"

RPROVIDES:${PN} += "libtrilinos_14_0_0-gnu-openmpi2-hpc \
libtrilinos_14_0_0-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libhdf5-gnu-openmpi2-hpc \
libm.so.6()(64bit) \
libnetcdf-gnu-openmpi2-hpc \
libopenblas-gnu-hpc \
libopenmpi2-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
