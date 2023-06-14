SUMMARY = "Development files for python39-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python39-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python39-bsddb3-devel-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "2105e14a14530bc5f75c4918e02c5cecb5124ec420468ee2d74f194f125ebf026a7fb07c0f4ed45c2ffe80423879f1d7cae702767edaa32c463f7c5dfc24acd5"

RPROVIDES:${PN} += "python39-bsddb3-devel"

RDEPENDS:${PN} += "python39-bsddb3"

inherit rpm
