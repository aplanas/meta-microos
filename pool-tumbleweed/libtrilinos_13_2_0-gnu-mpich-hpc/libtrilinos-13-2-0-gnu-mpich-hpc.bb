SUMMARY = "A collection of libraries of numerical algorithms"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This subpackage contains the shared libraries."
LICENSE = "LGPL-2.0-only"

PV = "13.2.0"

RPM_NAME = "libtrilinos_13_2_0-gnu-mpich-hpc-13.2.0-5.3.aarch64.rpm"
RPM_HASH = "759f9e8f5306d3275efebeb94c0eed093fa8d8571ddebe48806951912ec5c564b66687787c57dfdf955e9fd7d99e1edc53387ba43980ae4235a501e2828395ed"

RPROVIDES:${PN} += "libtrilinos-13-2-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-mpich-hpc \
libm.so.6 \
libnetcdf-gnu-mpich-hpc \
libopenblas-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
