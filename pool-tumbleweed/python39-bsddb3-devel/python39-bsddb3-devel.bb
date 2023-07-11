SUMMARY = "Development files for python39-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python39-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python39-bsddb3-devel-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "218e790daf69b0bd07c98dcafb2438a385a628ca52e22fcf2c0aaf449758e23f04f74008c8ebaf8d8f265132f4225ac77cdb973060d9c0d4f24acfcd52133683"

RPROVIDES:${PN} += "python39-bsddb3-devel"

RDEPENDS:${PN} += "python39-bsddb3"

inherit rpm
