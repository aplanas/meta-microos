SUMMARY = "Shared libraries for O2scl, a scientific computation library"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the shared libraries for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "libo2scl0-0.926-3.5.aarch64.rpm"
RPM_HASH = "80ca70d0487fe811b160b41a455652c136aebc52e2b71934c683b614de9aa20b4e07ee7bfa60f36bf622391778c28c543bf0d49b362d9f8d464ddcfedd30f70f"

RPROVIDES:${PN} += "libo2scl.so.0()(64bit) \
libo2scl0 \
libo2scl0(aarch-64) \
libo2scl_eos.so.0()(64bit) \
libo2scl_hdf.so.0()(64bit) \
libo2scl_part.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
