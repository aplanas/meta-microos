SUMMARY = "Development files for python310-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python310-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python310-bsddb3-devel-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "d581040e93df3dcdbf0cf11be1d6bff8236fe73de70d863cf2f1af5542ceec42d8ae5151b05e64518a7188ed1ec601a576f38c9ab497adf95c3146298a8ab6b4"

RPROVIDES:${PN} += "python310-bsddb3-devel"

RDEPENDS:${PN} += "python310-bsddb3"

inherit rpm
