SUMMARY = "SQLite3 VFS for Ceph"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "1f24c4e169ddb24ee01f1ecf08ae994c8f8155c044a88b2170686fe187b2396f9a73cb4b45881dcbb5e707ac4450ef1144f6168de26e77104034fa27cdfdf434"

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
