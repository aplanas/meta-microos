SUMMARY = "SQLite3 VFS for Ceph"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "36299ab67a87013c1f4601be3d7f7e474de7caa094ec992424cbd8cd621b340d56c9263ed4c0be1b2a1f48cb83a29f9dcc6d86294f3906b997ddd9503feefe54"

RPROVIDES:${PN} += "libcephsqlite \
libcephsqlite.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfmt.so.9 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
