SUMMARY = "Headers and development files for trilinos-openmpi4"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos-openmpi4 \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-openmpi4-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "3a5b07954174007d6e78cb1d95858614808e857a6c80b70edca1ea77b53eb8e666aeb7d89f00546143b9831fa27643da1b0ee23f7fc0b808112f414747959e5b"

RPROVIDES:${PN} += "trilinos-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
blacs-devel-headers \
glpk-devel \
hdf5-openmpi4-devel \
hypre-openmpi4-devel \
libtrilinos14-openmpi4 \
mumps-openmpi4-devel \
netcdf-openmpi4-devel \
ptscotch-openmpi4-devel \
scalapack-openmpi4-devel \
swig"

inherit rpm
