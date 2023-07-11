SUMMARY = "A collection of libraries of numerical algorithms"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This subpackage contains the shared libraries."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos_14_0_0-gnu-openmpi2-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "a20cd6f7bc95f8d865597d9dbdee5b41c44bc56264e3dd8bae4178eb1a14a07abee43e42ad8159456a5b141c7a6dd034511d1761dd987df5845a7174e04d709c"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-openmpi2-hpc \
libm.so.6 \
libnetcdf-gnu-openmpi2-hpc \
libopenblas-gnu-hpc \
libopenmpi2-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
