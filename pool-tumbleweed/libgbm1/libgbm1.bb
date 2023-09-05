SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libgbm1-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "a577ff0bf127a28e224ce811034e52b59b1c9d31a652ed79116591906bc41102fc3e9e280857750d6caac33f50bb512a1ac640bd174e362828e7591fff694267"

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
