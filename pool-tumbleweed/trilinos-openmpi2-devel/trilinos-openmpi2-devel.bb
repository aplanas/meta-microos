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

RPM_NAME = "trilinos-openmpi2-devel-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "97f307e933e2289f05bf36e7b14388430a3c9d357eb1b0581ff2cf3dd03b252ad1557469d7921e5cc53efbee55898bdee12b749deab7be2676dff0493cbc0132"

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
