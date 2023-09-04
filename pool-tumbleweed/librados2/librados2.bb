SUMMARY = "RADOS distributed object store client library"
DESCRIPTION = "RADOS is a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to access the distributed object \
store using a simple file-like interface."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librados2-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "93da4560aa0ce6279a73532c4798de30bd68f0ce73637faaeb367549aa423e55c19fc4ed9e780e31df2a5dbebd0c948526380fbe39f9e4f5180f7175090cb255"

RPROVIDES:${PN} += "libceph-common.so.2 \
librados-tp.so.2 \
librados.so.2 \
librados2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libibverbs.so.1 \
liblttng-ust.so.1 \
libm.so.6 \
librdmacm.so.1 \
libresolv.so.2 \
libstdc++.so.6 \
libudev.so.1 \
libz.so.1"

inherit rpm
