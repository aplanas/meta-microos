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

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi4-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "7772f324e92de82e0262c51f19260faa6d66e1a44e96f8cabc1092ff5060aa89b67816694ad188d768b5f52063b7b4d64ae3512b73e1e4e988cb6ca0c6991c03"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-openmpi4-hpc \
libm.so.6 \
libnetcdf-gnu-openmpi4-hpc \
libopenblas-gnu-hpc \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
