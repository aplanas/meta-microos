SUMMARY = "InfiniBand Communication Manager Assistant"
DESCRIPTION = "The ibacm daemon helps reduce the load of managing path record lookups on \
large InfiniBand fabrics by providing a user space implementation of what \
is functionally similar to an ARP cache.  The use of ibacm, when properly \
configured, can reduce the SA packet load of a large IB cluster from O(n^2) \
to O(n).  The ibacm daemon is started and normally runs in the background, \
user applications need not know about this daemon as long as their app \
uses librdmacm to handle connection bring up/tear down.  The librdmacm \
library knows how to talk directly to the ibacm daemon to retrieve data."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "ibacm-45.0-1.1.aarch64.rpm"
RPM_HASH = "c830cc30da8f21987d1bbee51de325d5d7b3b9006d0b3d7b4c15f84e138f8985a02341f1f9b7a7ca62688c0dce93a2ac3726f34bd820d9785c718e6bcd811ba9"

RPROVIDES:${PN} += "config(ibacm) \
ibacm \
ibacm(aarch-64) \
libibacmp.so()(64bit) \
libibacmp1"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibumad.so.3()(64bit) \
libibverbs.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
rdma-core(aarch-64) \
systemd"

inherit rpm
