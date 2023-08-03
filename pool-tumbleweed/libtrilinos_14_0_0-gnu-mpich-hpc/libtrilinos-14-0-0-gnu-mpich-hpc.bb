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

RPM_NAME = "libtrilinos_14_0_0-gnu-mpich-hpc-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "45c8aca6bdda2e84a31fb7098c69479c85c4df107a5d60a78c0615c0dccdf44f1cee0bf482eb9b7cbb77a202a917a7334754ff403bc4ba381dcad6b62002ff01"

RPROVIDES:${PN} += "libtrilinos-14-0-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-gnu-mpich-hpc \
libm.so.6 \
libnetcdf-gnu-mpich-hpc \
libopenblas-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
