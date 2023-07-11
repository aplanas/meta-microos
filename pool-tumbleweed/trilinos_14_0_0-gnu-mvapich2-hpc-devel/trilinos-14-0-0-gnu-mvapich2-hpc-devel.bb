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

RPM_NAME = "trilinos_14_0_0-gnu-mvapich2-hpc-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "64851495033824eebdb172e694896d80f782f38d786e1a3ffa2e32b62aba002e77c2bae8d2a63dbfac5d771fdbd0ed0a2816ece0323508b440ff8ce507d0db6c"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python \
/usr/bin/sh \
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
