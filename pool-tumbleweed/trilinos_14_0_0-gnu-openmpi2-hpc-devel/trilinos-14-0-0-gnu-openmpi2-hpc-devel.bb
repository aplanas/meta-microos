SUMMARY = "Headers and development files for trilinos_14_0_0-gnu-openmpi2-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_14_0_0-gnu-openmpi2-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-gnu-openmpi2-hpc-devel-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "bfd4a8acb0e8c0a830df811cd423d79075c0584db7b144dd94a161abf575ed0bd12f77eed88e4e99f7d52fb6c34b48854787cd37868a9458cf5e0b3d8d4e4f06"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python \
/usr/bin/sh \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libstdc++.so.6 \
libtrilinos-14-0-0-gnu-openmpi2-hpc \
netcdf-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc \
openmpi2-gnu-hpc-devel"

inherit rpm
