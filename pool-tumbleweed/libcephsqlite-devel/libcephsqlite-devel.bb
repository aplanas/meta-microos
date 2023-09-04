SUMMARY = "SQLite3 VFS for Ceph headers"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "0448a2e8c653277cf600dd1a53fe53863f425f43e4ad142d4f930537c6087962df23a18ea058594debb502fa8877a62351d0587207630f6eb549e6c2485e9bc4"

RPROVIDES:${PN} += "libcephsqlite-devel"

RDEPENDS:${PN} += "libcephsqlite \
librados-devel \
libradospp-devel \
sqlite-devel"

inherit rpm
