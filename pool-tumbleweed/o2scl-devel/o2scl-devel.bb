SUMMARY = "Source and header files for O2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the source and header files for writing software \
using o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "o2scl-devel-0.926-3.6.aarch64.rpm"
RPM_HASH = "788b951610519befd589c7b40bcafe35db616142e0be614a947454cfc1612de76fba2a76b905f8e255a849c52554c1cde12cc002a0203b678d86789c706230c9"

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
