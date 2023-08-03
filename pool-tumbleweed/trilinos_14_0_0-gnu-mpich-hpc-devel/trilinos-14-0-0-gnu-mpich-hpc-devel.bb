SUMMARY = "Headers and development files for trilinos_14_0_0-gnu-mpich-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_14_0_0-gnu-mpich-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-gnu-mpich-hpc-devel-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "cef6bf43f228d1f9419a59c7bff3f0cce6d9fe109957356dd5225dc8060d5014232c342fb1102a0c1429b8ee8f1fa21d76b1116ac1f833df6e101b91d52d9a6c"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python \
/usr/bin/sh \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libstdc++.so.6 \
libtrilinos-14-0-0-gnu-mpich-hpc \
mpich-gnu-hpc \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel"

inherit rpm
