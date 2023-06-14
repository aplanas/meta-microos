SUMMARY = "Development files for python311-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python311-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python311-bsddb3-devel-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "dc82da835d186ba3e0802e762a0f4f5d092f2aeeca5eaf475d63797d048c14a605ce05a472186eaec010c88742a7cf10a0bb824735bed3cdbcbe408038fa7f70"

RPROVIDES:${PN} += "python311-bsddb3-devel"

RDEPENDS:${PN} += "python311-bsddb3"

inherit rpm
