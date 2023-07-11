SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rsocket-45.0-1.2.aarch64.rpm"
RPM_HASH = "48f58d8f0e8d6b3fbb950e44be5508133efc8c3239bfa9de8f686f1db6a44908dbd6a25af699284e78f06be9190d59ed6ad0269bf1aef0c0825163dbcacc2ff8"

RPROVIDES:${PN} += "librspreload.so \
rsocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdmacm.so.1"

inherit rpm
