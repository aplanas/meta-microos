SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rsocket-47.0-1.1.aarch64.rpm"
RPM_HASH = "246154e688a3b740af14f13627d345d97761326e44548cf935adc7acde4aaa18ddae7bd8f7d56c8339900bda7412692c7a44a3cb9a8bad0109be996291bf69f9"

RPROVIDES:${PN} += "librspreload.so \
rsocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdmacm.so.1"

inherit rpm
