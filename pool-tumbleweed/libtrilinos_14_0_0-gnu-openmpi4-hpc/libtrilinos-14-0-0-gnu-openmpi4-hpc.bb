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

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi4-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "dda0a7359247d7d421ad0a59f5efcbd1cdb192218af1212114873712871e6f8a2ad49098db96bef3cab320b693dc6584a6b0547845f3630d3b1398ed0110a80d"

RPROVIDES:${PN} += "libtrilinos_14_0_0-gnu-openmpi4-hpc \
libtrilinos_14_0_0-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libhdf5-gnu-openmpi4-hpc \
libm.so.6()(64bit) \
libnetcdf-gnu-openmpi4-hpc \
libopenblas-gnu-hpc \
libopenmpi4-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
