SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "f8a81787973b9652768c70290ff7ebba5a491e1284fd686c8e3b21bcb888bbee15bb830b529c448a1f445d307b8047fa7ea483b68ed1289daf71ddd3ecc869a7"

RPROVIDES:${PN} += "config-dapl \
dapl \
libdaplofa.so.2 \
libdaploscm.so.2 \
libdaploucm.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1 \
sed"

inherit rpm
