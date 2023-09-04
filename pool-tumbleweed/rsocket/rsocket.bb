SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rsocket-47.0-2.2.aarch64.rpm"
RPM_HASH = "596dc1a5ef78bcf6ac0eb5c783c565d325669915e68dbe17117500c8c7c63ae80a232110fdfade3417b1e0712dc567484ac2bfbc18c48e9c0acebda01ce939a0"

RPROVIDES:${PN} += "librspreload.so \
rsocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdmacm.so.1"

inherit rpm
