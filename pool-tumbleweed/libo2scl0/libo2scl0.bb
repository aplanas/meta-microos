SUMMARY = "Shared libraries for O2scl, a scientific computation library"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the shared libraries for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "libo2scl0-0.926-3.5.aarch64.rpm"
RPM_HASH = "80ca70d0487fe811b160b41a455652c136aebc52e2b71934c683b614de9aa20b4e07ee7bfa60f36bf622391778c28c543bf0d49b362d9f8d464ddcfedd30f70f"

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
