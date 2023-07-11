SUMMARY = "Shared library for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development/ \
 \
This package contains shared library."
LICENSE = "BSD-3-Clause"

PV = "4.5.4"

RPM_NAME = "libsqlcipher-3_41_2-0-4.5.4-1.2.aarch64.rpm"
RPM_HASH = "37a61cf63a0adea78687a5903ba3949a30ad446a0ee41888be0d40e15b4f617f582298db54a81025f7bb61a77777cbf1ff2b4bf7763339bcb9e49cbe38b990b1"

RPROVIDES:${PN} += "libsqlcipher-3-41-2-0 \
libsqlcipher-3.41.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
