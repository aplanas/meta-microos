SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rsocket-47.0-3.1.aarch64.rpm"
RPM_HASH = "52765105851dcd34185fbdade1d38171e5b91e0e344ae574688567489522748633e60d9b564610969a109e2cec2cfab7679124d56557402f28461511ab4bea54"

RPROVIDES:${PN} += "librspreload.so \
rsocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdmacm.so.1"

inherit rpm
