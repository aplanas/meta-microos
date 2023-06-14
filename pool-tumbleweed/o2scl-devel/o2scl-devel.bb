SUMMARY = "Source and header files for O2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the source and header files for writing software \
using o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "o2scl-devel-0.926-3.5.aarch64.rpm"
RPM_HASH = "c42702e53eb1dde9f1ec8f07e84bcaec7f8e293950f594ae56965b7f932f8ddc6e4ab41138d8b70faa62df9b868d2897eff2669931a50a9770f3c66b4f09dc6a"

RPROVIDES:${PN} += "o2scl-devel"

RDEPENDS:${PN} += "armadillo-devel \
eigen3-devel \
gcc-c++ \
hdf5-devel \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libm.so.6 \
libo2scl-hdf.so.0 \
libo2scl-part.so.0 \
libo2scl.so.0 \
libo2scl0 \
libstdc++.so.6 \
pkgconfig-gsl \
readline-devel"

inherit rpm
