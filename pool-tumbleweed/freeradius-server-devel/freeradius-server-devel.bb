SUMMARY = "FreeRADIUS Development Files"
DESCRIPTION = "FreeRADIUS header files for development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-devel-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "b91cd175041d32abe780c9fac0de135479c9e2b586c25c8d6ce6fc05b558c9d2eac8bd4357b6ae57f7bd7b57b3fe377a916f5c4eaf0c8dc5a2f8cd8ebc447550"

RPROVIDES:${PN} += "freeradius-server-devel"

RDEPENDS:${PN} += "freeradius-server-libs"

inherit rpm
