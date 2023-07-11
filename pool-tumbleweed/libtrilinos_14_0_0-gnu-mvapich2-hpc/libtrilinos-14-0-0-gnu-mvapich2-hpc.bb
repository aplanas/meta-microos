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

RPM_NAME = "libtrilinos_14_0_0-gnu-mvapich2-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "30fe8c4f6689f0d335ffe177d3923124b95123ab965b022822f17a99f287de835ba0c49738871ce49a22d42d5a42313031a899e7273092c8ba46be3f285a059a"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-mvapich2-hpc \
libm.so.6 \
libnetcdf-gnu-mvapich2-hpc \
libopenblas-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
