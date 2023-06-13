SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python310-bsddb3-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "0050384074729ea22c56695244437917ba2b3a0ca7a5dd5ab99c12567a3cec777f63a612dfdf24f7b5d683929ae848ab08e22b52045ed6cd8694ebc711fce9a1"

RPROVIDES:${PN} += "python3-bsddb3 \
python3.10dist(bsddb3) \
python310-bsddb3 \
python310-bsddb3(aarch-64) \
python3dist(bsddb3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdb-4.8.so()(64bit) \
python(abi)"

inherit rpm
