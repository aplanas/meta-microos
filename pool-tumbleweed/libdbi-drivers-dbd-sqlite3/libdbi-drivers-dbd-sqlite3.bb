SUMMARY = "SQLite3 driver for libdbi"
DESCRIPTION = "This driver provides connectivity to SQLite 3.x database servers through the \
libdbi database independent abstraction layer. Switching a program's driver \
does not require recompilation or rewriting source code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-sqlite3-0.9.0.g53-3.18.aarch64.rpm"
RPM_HASH = "3a738990a6c5294a5dd3b9e1b240dc087161a57a7fa51ebb178988e86a1968a49f34b80a7e6d12374e750a64cc4e0fbd725b5205350252be6b41b6386c4eb47a"

RPROVIDES:${PN} += "libdbdsqlite3.so()(64bit) \
libdbi-drivers-dbd-sqlite3 \
libdbi-drivers-dbd-sqlite3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
