SUMMARY = "Shared library providing Embree raytracing kernels"
DESCRIPTION = "Embree is a collection of ray tracing kernels. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "3.13.5"

RPM_NAME = "libembree3-3.13.5-2.4.aarch64.rpm"
RPM_HASH = "8e6674a656984754eb4752aa8dc3420f4e24b0a0bdabef27361043b99a3a1efa8d5a4549b5ace6e93057e7570dffcaf54122b5ccf24797a6aaeae837c95977f2"

RPROVIDES:${PN} += "libembree3 \
libembree3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
