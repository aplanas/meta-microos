SUMMARY = "Fortran bindings for development with PLplot"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the files necessary for using PLplot in Fortran."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotfortran-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "7781a01ba1131698332a884fc6c08d7b5551d8f3470e3bbab7f3748622bc7521c84997adb0499a7d792564c9126c121749a6cc3062dddc728d5883c2a3efae85"

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
