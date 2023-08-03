SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libgbm1-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "f88a0aa35d26bbff0fa14d31ffcbc6dd0c124428ed87b36a6b088c339d6054952c35091189e232ae39cab2527d7c99a389ec0ce3e92f7bb3bccaeaa4eac1ebc0"

RPROVIDES:${PN} += "libgbm.so.1 \
libgbm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libwayland-server.so.0 \
libxcb-randr.so.0"

inherit rpm
