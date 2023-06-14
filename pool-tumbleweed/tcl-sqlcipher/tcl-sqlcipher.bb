SUMMARY = "Tcl extension for sqlcipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development/ \
 \
This package provides tcl extension for SQLCipher."
LICENSE = "BSD-3-Clause"

PV = "4.5.4"

RPM_NAME = "tcl-sqlcipher-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "14cc4808f7da7b089b3a81ccaef1069d72b90661fc35928bfe3daf6c550af5a712a7e17c119ba76427945a8b1b3dec7b82d3e8174171b6dadf56620f279dbb9d"

RPROVIDES:${PN} += "libtclsqlite3.so \
sqlcipher-tcl \
tcl-sqlcipher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlcipher-3.41.2.so.0 \
tcl"

inherit rpm
