SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python39-bsddb3-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "3bc3e48662660397af33c531d0f37e1799f8a095b576413b11b3ccf092b5d1115ddfcd5c42894a5c918e77d149f168c9a6cc6f98e7d6105877a91679b050097e"

RPROVIDES:${PN} += "python3.9dist(bsddb3) \
python39-bsddb3 \
python39-bsddb3(aarch-64) \
python3dist(bsddb3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdb-4.8.so()(64bit) \
python(abi)"

inherit rpm
