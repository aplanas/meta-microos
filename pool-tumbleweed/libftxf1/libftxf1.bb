SUMMARY = "Library for Transactional NTFS (TxF) data types"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libftxf1-20220116-3.3.aarch64.rpm"
RPM_HASH = "b925d0a55951ac629d8ea0e3e9a4bff3eef930613fc4953b66561853a1893cf185fef1bbb756d5d6fc65686f1c47001436c0697ca8eecb8427866091f0c654d0"

RPROVIDES:${PN} += "libftxf.so.1 \
libftxf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfusn.so.1"

inherit rpm
