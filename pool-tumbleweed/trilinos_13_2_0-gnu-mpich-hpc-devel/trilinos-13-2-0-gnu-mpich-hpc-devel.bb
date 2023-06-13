SUMMARY = "Headers and development files for trilinos_13_2_0-gnu-mpich-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_13_2_0-gnu-mpich-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "13.2.0"

RPM_NAME = "trilinos_13_2_0-gnu-mpich-hpc-devel-13.2.0-5.3.aarch64.rpm"
RPM_HASH = "1e5746361dd0a74b9b27930134bd21c1e225b2feea36c5cf62beb860cfbb2759a823ecb2c9d2013bc7d317ed738fed095cc02fb28f822ccb4f3bd3382972c37d"

RPROVIDES:${PN} += "trilinos_13_2_0-gnu-mpich-hpc-devel \
trilinos_13_2_0-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas-gnu-hpc-devel \
libstdc++.so.6()(64bit) \
libtrilinos_13_2_0-gnu-mpich-hpc \
mpich-gnu-hpc \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel"

inherit rpm
