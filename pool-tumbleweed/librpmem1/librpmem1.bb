SUMMARY = "Remote Access to Persistent Memory library"
DESCRIPTION = "The librpmem library provides low-level support for remote access \
to persistent memory utilizing RDMA-capable NICs. It can be used \
to replicate persistent memory regions over RDMA protocol."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "librpmem1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "79ca182b322d68e39a49bb27760ee85147fae13c74de67bd0b2d5c3168ce52b6b7c37cb86e2b213b1f0d642c87524a491b2f0974ef6c0da30b611924d99448f0"

RPROVIDES:${PN} += "librpmem.so.1()(64bit) \
librpmem1 \
librpmem1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfabric \
libfabric.so.1()(64bit) \
openssh"

inherit rpm
