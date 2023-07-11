SUMMARY = "DBD driver for SQLite 3"
DESCRIPTION = "DBD driver for SQLite 3 database."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-sqlite3-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "f106b30bd5ee3eea80359316d8d5d3dbfd9228c13a7527c829fff1b33ea893f13dfeedf74637878175d63483851d3023dd2f2d7317493d950ed9dc272566a9f8"

RPROVIDES:${PN} += "libapr-util1-0-dbd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-util1-0 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
