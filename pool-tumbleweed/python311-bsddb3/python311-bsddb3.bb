SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python311-bsddb3-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "49f1aac4f1d6b4150b42c3e5bbe0f646518f80de483480dec5f629dc73f283e2a3bb81d83e1f8c879bda0ae637f0cd41cab80c0f6df64faaa2001120276dac14"

RPROVIDES:${PN} += "python3-bsddb3 \
python3.11dist-bsddb3 \
python311-bsddb3 \
python3dist-bsddb3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
