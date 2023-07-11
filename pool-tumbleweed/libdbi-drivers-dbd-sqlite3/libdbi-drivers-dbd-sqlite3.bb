SUMMARY = "SQLite3 driver for libdbi"
DESCRIPTION = "This driver provides connectivity to SQLite 3.x database servers through the \
libdbi database independent abstraction layer. Switching a program's driver \
does not require recompilation or rewriting source code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-sqlite3-0.9.0.g53-3.19.aarch64.rpm"
RPM_HASH = "1f5152acbbf026048339169bedb22853426b1b0f2a622f2c7067901bbb3a6c8a6031e8fcd7ed05dbaa02ae674c5770b5d5ad15e3d43e1d0257bd70150cc33da9"

RPROVIDES:${PN} += "libdbdsqlite3.so \
libdbi-drivers-dbd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libsqlite3.so.0"

inherit rpm
