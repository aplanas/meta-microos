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

RPM_NAME = "trilinos_14_0_0-gnu-openmpi3-hpc-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "88fb68365d336e056d386580bc13c0381d39bc1c4d0e3cf0e6ba600191d82be29545ceabd22ba9b082946e0f4e9246442f83a6dae1360e2328caf057b8445dff"

RPROVIDES:${PN} += "trilinos_14_0_0-gnu-openmpi3-hpc-devel \
trilinos_14_0_0-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas-gnu-hpc-devel \
libstdc++.so.6()(64bit) \
libtrilinos_14_0_0-gnu-openmpi3-hpc \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc \
openmpi3-gnu-hpc-devel"

inherit rpm
