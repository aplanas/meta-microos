SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "f53ddbccb5443478be1ab1c784979e7bf0d993688f70864b114824c089019f97990d2c7c47709e24b469548262af2bb485b7b1bd870c6d077e3261fd534fa770"

RPROVIDES:${PN} += "config-dapl-debug \
dapl-debug \
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
