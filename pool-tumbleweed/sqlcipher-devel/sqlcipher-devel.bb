SUMMARY = "Development files for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development. \
 \
This package contains development files for SQLCipher."
LICENSE = "BSD-3-Clause"

PV = "4.5.4"

RPM_NAME = "sqlcipher-devel-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "ebbf5e6e6345df5584239e1cb30d451876275f6406cd4e71e64610bd570566650a95892364d5db0298dc1b105ed90e9533836f5a10fc512857b045db4b8f1680"

RPROVIDES:${PN} += "pkgconfig(sqlcipher) \
sqlcipher-devel \
sqlcipher-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsqlcipher-3_41_2-0 \
sqlcipher \
tcl-sqlcipher"

inherit rpm
