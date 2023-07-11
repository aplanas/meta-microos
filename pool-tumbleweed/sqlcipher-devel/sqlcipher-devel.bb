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

RPM_NAME = "sqlcipher-devel-4.5.4-1.2.aarch64.rpm"
RPM_HASH = "80d57666320216ddd66cdbfed43de2079cd6c09d72c3ee09e11e1aed4126a5125088076813ca4b5e441ff04c51668c104b4223b79997141817e0414abe5e1635"

RPROVIDES:${PN} += "pkgconfig-sqlcipher \
sqlcipher-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsqlcipher-3-41-2-0 \
sqlcipher \
tcl-sqlcipher"

inherit rpm
