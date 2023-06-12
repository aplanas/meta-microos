SUMMARY = "Example source code for programs to use libical"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-doc-3.0.16-1.5.noarch.rpm"
RPM_HASH = "0a82dfe2d276e9a65fa31e5e69c9c7117944c619fe2d02caa5941d79288f4e6ae61ecbca1c4d8622516d1a9fc177ddf4ce0389c66108d5e3fe30fd37529c536f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-doc"
RDEPENDS:${PN} += ""

inherit rpm
