SUMMARY = "SQLite database encryption"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development."
LICENSE = "BSD-3-Clause"

PV = "4.5.4"

RPM_NAME = "sqlcipher-4.5.4-1.2.aarch64.rpm"
RPM_HASH = "1e701b7793a2e0170ae8066f59d12eaae837b5fdc9c230038748d0086205e453993f9ddfd7e178da6b85872122d08519bb62801bee2cb13c2a1031fbbf817cd9"

RPROVIDES:${PN} += "sqlcipher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
