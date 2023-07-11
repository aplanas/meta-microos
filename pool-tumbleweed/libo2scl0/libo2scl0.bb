SUMMARY = "Shared libraries for O2scl, a scientific computation library"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the shared libraries for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "libo2scl0-0.926-3.6.aarch64.rpm"
RPM_HASH = "7125b07191886cb4d50a0b03859810ea2ee85c230a9cd89ca72bee692f2b619223dfc3919c2ac18b89ae4682e0c518f5d7edf78c0550f6151dff4c13460bd5a2"

RPROVIDES:${PN} += "libo2scl-eos.so.0 \
libo2scl-hdf.so.0 \
libo2scl-part.so.0 \
libo2scl.so.0 \
libo2scl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
