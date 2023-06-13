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

RPM_NAME = "trilinos-openmpi4-devel-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "d866912f51835e7bf579bc9f49ddf8b2e7510cdd10a5aa82c30fe8731e6e2764f5401bd46244b64917a47669ce174194b57ce13eaa534b990c7f4411c64402bc"

RPROVIDES:${PN} += "trilinos-openmpi4-devel \
trilinos-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/python3 \
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
