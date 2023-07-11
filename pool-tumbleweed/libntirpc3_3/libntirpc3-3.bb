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

RPM_NAME = "libntirpc3_3-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "a26256ba9766241b0b077db42b8a2430fff8cd96f94dc4eff0efd80a4195805fdae076d7d9461d88911a6fbba47c9ed2897f9c7c1d65642b543cd3f0b49b0f6f"

RPROVIDES:${PN} += "libntirpc.so.3.3 \
libntirpc3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
liburcu-bp.so.8"

inherit rpm
