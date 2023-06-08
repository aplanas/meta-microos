SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-pcp-276.1-4.3.aarch64.rpm"
RPM_HASH = "faaa3c6cd9669fc0b258faeeb5e2ec39c3459f40bcbeb27a3ab807aafb160e9de66c5a5e72c9491af54b3c3fc23478d4a9004f8677292b1d0deec545cecb4030"

RPROVIDES:${PN} += "cockpit-pcp cockpit-pcp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cockpit-bridge ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.9)(64bit) pcp"

inherit rpm
