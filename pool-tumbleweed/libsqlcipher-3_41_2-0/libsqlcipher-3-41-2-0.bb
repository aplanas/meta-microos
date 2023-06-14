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

RPM_NAME = "libsqlcipher-3_41_2-0-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "ae6ffb7c6ed17181317d9e3309e31b211c84f1bac09a7201417ec02e09210aa02571c49139cbbb273a3c1acd74690ea841917ca37eba9b048ec5c38719067ea5"

RPROVIDES:${PN} += "libsqlcipher-3-41-2-0 \
libsqlcipher-3.41.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
