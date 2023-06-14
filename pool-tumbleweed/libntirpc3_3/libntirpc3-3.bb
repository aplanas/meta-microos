SUMMARY = "NFS-Ganesha transport-independent RPC (TI-RPC) shared library"
DESCRIPTION = "This package contains a new implementation of the original libtirpc, \
transport-independent RPC (TI-RPC) library for NFS-Ganesha. It has \
the following features not found in libtirpc: \
 1. Bi-directional operation \
 2. Full-duplex operation on the TCP (vc) transport \
 3. Thread-safe operating modes \
 3.1 new locking primitives and lock callouts (interface change) \
 3.2 stateless send/recv on the TCP transport (interface change) \
 4. Flexible server integration support \
 5. Event channels (remove static arrays of xprt handles, new EPOLL/KEVENT \
    integration)"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libntirpc3_3-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "4303b9774ca8d7168cab1bae9d08d9e1e366dec750e6cb5307fddf4fe4acf1159cea5ce095959da61e4510c64f4e093fea801c1f912c1fbeef38850a65662c05"

RPROVIDES:${PN} += "libntirpc.so.3.3 \
libntirpc3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
liburcu-bp.so.8"

inherit rpm
