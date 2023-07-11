SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python310-bsddb3-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "506151776b9b33a2ff1e823ac31babd2d4c1ae7a28e89d470e7d36b7eb650875383db6a5ea7f6cbcd0af84497fd996f40da094a56c6ca38104f1728ae3e79aed"

RPROVIDES:${PN} += "python3.10dist-bsddb3 \
python310-bsddb3 \
python3dist-bsddb3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
