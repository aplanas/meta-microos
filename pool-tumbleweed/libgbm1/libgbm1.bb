SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libgbm1-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "e795ee5b29c0553dbb0fbf1255ee0c93ab879de03c48a2ca984a91c6ffe8c220c1e2d225c40d45517f27ec6e0bae7049a757b017fa39314e2721d42fb7ec2b80"

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
