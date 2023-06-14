SUMMARY = "RADOS block device client library"
DESCRIPTION = "RBD is a block device striped across multiple distributed objects in \
RADOS, a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to manage these block devices."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librbd1-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "532f58a0aadcfaf937fc988a3e7e9bc67ac961fcecdf70e15ca9ad603e8adceabe2f6b8f1779c13c71475cc5445d9677376f0b239eb3db9954282a0a78a2e3cf"

RPROVIDES:${PN} += "libceph-librbd-parent-cache.so.1 \
libceph-librbd-pwl-cache.so.1 \
librbd-tp.so.1 \
librbd.so.1 \
librbd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libfmt.so.9 \
libgcc-s.so.1 \
liblttng-ust.so.1 \
librados.so.2 \
librados2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
