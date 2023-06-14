SUMMARY = "Headers and development files for trilinos_14_0_0-gnu-mvapich2-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos_14_0_0-gnu-mvapich2-hpc \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-gnu-mvapich2-hpc-devel-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "3a4226712bdf7157426e3c6b152bda225fca72ce36cf131d53e71d2b2a98aa4f054ee6ef2dd7a57c4820ed2667323c6c587f79f5183ee12c45bd9388293f998d"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python \
gnu-compilers-hpc \
gnu-compilers-hpc-devel \
hdf5-gnu-mvapich2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libstdc++.so.6 \
libtrilinos-14-0-0-gnu-mvapich2-hpc \
mvapich2-gnu-hpc \
mvapich2-gnu-hpc-devel \
netcdf-gnu-mvapich2-hpc-devel"

inherit rpm
