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

PV = "47.0"

RPM_NAME = "ibacm-47.0-3.1.aarch64.rpm"
RPM_HASH = "b60c14963b702824bb9799d084d2029d367dab284d6b94ebb8af3cda3d97ac21647a699576bb62856ae4bf294caa3ff21c611756a90216c78dfa5ad8584b5713"

RPROVIDES:${PN} += "config-ibacm \
ibacm \
libibacmp.so \
libibacmp1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libibverbs.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libsystemd.so.0 \
rdma-core \
systemd"

inherit rpm
