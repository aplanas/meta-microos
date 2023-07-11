SUMMARY = "Development files for python311-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python311-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python311-bsddb3-devel-6.2.9-1.14.aarch64.rpm"
RPM_HASH = "b2ebafb0d07ae981dc8ff68a6eb7642db13bd57848c09c1f79233a32ab8f00b6da93535594040061841549833251a513da1b78a5f1e96bab79642c8655c0a43a"

RPROVIDES:${PN} += "python3-bsddb3-devel \
python311-bsddb3-devel"

RDEPENDS:${PN} += "python311-bsddb3"

inherit rpm
