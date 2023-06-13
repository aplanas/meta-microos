SUMMARY = "SQLite3 VFS for Ceph"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "83f579d4835f1e99942944654c1271fa8ab969a6f75106d5b8115263eedf4674fe1b9fc56484c2edb8fd437a34ec81e12e9706b100aae111a5fcad7933433515"

RPROVIDES:${PN} += "libcephsqlite \
libcephsqlite(aarch-64) \
libcephsqlite.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
librados.so.2()(64bit) \
librados2 \
libstdc++.so.6()(64bit)"

inherit rpm
