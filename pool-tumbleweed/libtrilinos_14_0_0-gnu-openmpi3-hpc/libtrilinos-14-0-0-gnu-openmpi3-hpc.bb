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

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi3-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "f21ec34b4810ff72bb8ba25edb474e793069e8518f3f152a44e6bdbaa9a31b5adf48fadf71723f9edd1ec3fd46cd0625d1ddfd6d88c7fc0364f9a699c0da22a9"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
