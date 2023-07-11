SUMMARY = "Headers and development files for trilinos_14_0_0-gnu-openmpi3-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_14_0_0-gnu-openmpi3-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-gnu-openmpi3-hpc-devel-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "f70a2f485f158b744c28bc8751bb158ee3f5460ce2beadb1bfbe493bfdfb143f28f5ec1d2659f404d27f9fa60639ab088669a0150d9b2cbb5dea540db1302848"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python \
/usr/bin/sh \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libstdc++.so.6 \
libtrilinos-14-0-0-gnu-openmpi3-hpc \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc \
openmpi3-gnu-hpc-devel"

inherit rpm
