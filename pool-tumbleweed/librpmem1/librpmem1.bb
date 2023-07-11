SUMMARY = "Remote Access to Persistent Memory library"
DESCRIPTION = "The librpmem library provides low-level support for remote access \
to persistent memory utilizing RDMA-capable NICs. It can be used \
to replicate persistent memory regions over RDMA protocol."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "librpmem1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "54cf62aa716ea90551da7f762c605e08ecb4b6f1ef42762358ea2dc09ef3a62fd79663ee7258b037df0edcd091e7efab7e928d6a12bad2329c2b8eb35432307b"

RPROVIDES:${PN} += "librpmem.so.1 \
librpmem1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric \
libfabric.so.1 \
openssh"

inherit rpm
