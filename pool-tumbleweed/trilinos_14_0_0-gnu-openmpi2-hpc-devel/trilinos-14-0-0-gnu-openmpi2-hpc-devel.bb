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

RPM_NAME = "trilinos_14_0_0-gnu-openmpi2-hpc-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "40782c04cc5d6a636d7a20299d8b9cb6c0ca8dc0f43ca9cc7da9d35a40ab7d19c1472b1430dd11a160f1264cf30c1a18fe5fab3401f041d1fcd2b2cf28bf8add"

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
