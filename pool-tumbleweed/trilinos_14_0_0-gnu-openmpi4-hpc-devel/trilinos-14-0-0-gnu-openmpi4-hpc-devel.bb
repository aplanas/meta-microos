SUMMARY = "Headers and development files for trilinos_14_0_0-gnu-openmpi4-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_14_0_0-gnu-openmpi4-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-gnu-openmpi4-hpc-devel-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "ad6869b4848ecdb61351c9228673a68b334b4aeb6f99f4a62ee01e0a1f8cf0325388a376dbb4afb41a1ab2bd1db010e151123b812bc9c7c577152ed607cf6f70"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python \
/usr/bin/sh \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi4-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libstdc++.so.6 \
libtrilinos-14-0-0-gnu-openmpi4-hpc \
netcdf-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc \
openmpi4-gnu-hpc-devel"

inherit rpm
