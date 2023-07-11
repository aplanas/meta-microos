SUMMARY = "Headers and development files for trilinos-openmpi2"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos-openmpi2 \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-openmpi2-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "6fc052e3559c28e73132c86fa0124b843973deb729fb39923de0a584af82331d801068d5db3e7fd3147646eafccef4f0a4086cf7e01c1e836b27a0743e9b62c0"

RPROVIDES:${PN} += "trilinos-openmpi2-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
blacs-devel-headers \
glpk-devel \
hdf5-openmpi2-devel \
hypre-openmpi2-devel \
libtrilinos14-openmpi2 \
mumps-openmpi2-devel \
netcdf-openmpi2-devel \
ptscotch-openmpi2-devel \
scalapack-openmpi2-devel \
swig"

inherit rpm
