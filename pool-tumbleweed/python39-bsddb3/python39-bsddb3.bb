SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python39-bsddb3-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "4b01ffc4aba5abe3bb30926c5cdc650b681a92f05837db6f51512a2e877e1b7aa2ce8163778b1e15026d218893c74578ad5498e211218935a68a639f558b3b14"

RPROVIDES:${PN} += "python3.9dist-bsddb3 \
python39-bsddb3 \
python3dist-bsddb3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
