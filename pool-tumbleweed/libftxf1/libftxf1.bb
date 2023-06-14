SUMMARY = "Library for Transactional NTFS (TxF) data types"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libftxf1-20220116-3.2.aarch64.rpm"
RPM_HASH = "b56248b8e21e92ad4ef31b2e2728f695ee4c120d73f79c795ec66feb44c25373fe636df4d9f58d10cae4d62f1f536b47e92a335eba0c3b0de5dd44483ca01b7c"

RPROVIDES:${PN} += "libftxf.so.1 \
libftxf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfusn.so.1"

inherit rpm
