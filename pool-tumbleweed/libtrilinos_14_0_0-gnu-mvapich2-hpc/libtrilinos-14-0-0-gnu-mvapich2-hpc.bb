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

RPM_NAME = "libtrilinos_14_0_0-gnu-mvapich2-hpc-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "f761240d8a48027e794992cac167d01ec09bb0036b871c3d056c6b85bf23e07b464bfe6a97a9eb17d2eb01a53bd53ca6d1c0074c51291476ecfd5bbbe9bcab56"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
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
