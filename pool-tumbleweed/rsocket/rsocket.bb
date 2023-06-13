SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rsocket-45.0-1.1.aarch64.rpm"
RPM_HASH = "480bc43557e43dc9f295781bc3934d9a644fba7c858d5cdc23708bca878690dc4319d133e59e0cfe0785d8ab33a7285f26b9eaa7bc3f03dee4ad25338e28b7ea"

RPROVIDES:${PN} += "librspreload.so()(64bit) \
rsocket \
rsocket(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
