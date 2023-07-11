SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "libgbm1-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "bc39ddfe0e8d53d27e441aebb64493aa59dc110a311e5e429ec886812779cc2edea2f597069f0377c94c006b4913a1d1650851e39e8447c8e9b240937c3bf86d"

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
