SUMMARY = "Fortran bindings for development with PLplot"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the files necessary for using PLplot in Fortran."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotfortran-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "dd04cd8eaa84ff5fc8c9c947f5441b314d2a158f8d19764400502052b19d7b0f863e5674958e3b74cb82830989ee9dcdf7b4e8023a3c8834ccf6b0e4c6a27e8d"

RPROVIDES:${PN} += "pkgconfig-plplot-fortran \
plplot-fortran-devel \
plplotf95-devel \
plplotfortran-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
gcc-fortran \
libplplotfortran0 \
pkgconfig \
pkgconfig-plplot \
plplot-common"

inherit rpm
