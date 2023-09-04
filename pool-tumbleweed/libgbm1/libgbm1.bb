SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libgbm1-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "dcf21ed75e6bd45394d85a4da430003ea28bf110dcf8b18cffed691a1bbabd1d238a82792b2bac76a47ef3187ddca623fa356184951e564b9f8657183f1dc106"

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
