SUMMARY = "SQLite3 VFS for Ceph headers"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "acf99085f69a74663aab135cf9061575a87965d639af9dc4fff14ccff3529b2f6410fe6c73a12f09826713108619aaf3338499b4144867b982a82de03e9e9d4d"

RPROVIDES:${PN} += "libcephsqlite-devel"

RDEPENDS:${PN} += "libcephsqlite \
librados-devel \
libradospp-devel \
sqlite-devel"

inherit rpm
