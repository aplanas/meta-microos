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

RPM_NAME = "tcl-sqlcipher-4.5.4-1.2.aarch64.rpm"
RPM_HASH = "a87d32a7f49f4e254a9672b4c7f7fdb3f3a0a02229f15721a58afe389532227e1acf89bda3e091cd7c0ca7e8d2ee1e5125d77af0cd95ae6de5900f557c05f42a"

RPROVIDES:${PN} += "libtclsqlite3.so \
sqlcipher-tcl \
tcl-sqlcipher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlcipher-3.41.2.so.0 \
tcl"

inherit rpm
