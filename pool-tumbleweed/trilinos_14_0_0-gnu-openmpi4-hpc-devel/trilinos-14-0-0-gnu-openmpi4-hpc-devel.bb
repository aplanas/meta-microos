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

RPM_NAME = "trilinos_14_0_0-gnu-openmpi4-hpc-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "92328a407b60cffacce648f910455aff734bf0de912f4881fa8553b444a2c60591e96ae5c2230e339d9737d4afd54e2e6dcb44df5f7de16304a90171574663e6"

RPROVIDES:${PN} += "trilinos-14-0-0-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python \
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
