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

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi3-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "72f258a8d4ccd45564b3182bca328fd2113d651f8b90858866c0c780521956352af0e78a96f3481bc06aff455845538ba57892352802ddf64fe3136ea395c367"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-openmpi3-hpc \
libm.so.6 \
libnetcdf-gnu-openmpi3-hpc \
libopenblas-gnu-hpc \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi3-gnu-hpc"

inherit rpm
