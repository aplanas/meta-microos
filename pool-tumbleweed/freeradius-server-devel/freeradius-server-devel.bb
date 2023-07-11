SUMMARY = "FreeRADIUS Development Files"
DESCRIPTION = "FreeRADIUS header files for development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-devel-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "0a0e74f6371ffe82da9d5a4c8e286497ba221d69ccbbcd605faa3df3d9749aa873f4145e67d78d3c4656fe848abdd115e4d9269b244ae8f25349941e9f629371"

RPROVIDES:${PN} += "freeradius-server-devel"

RDEPENDS:${PN} += "freeradius-server-libs"

inherit rpm
