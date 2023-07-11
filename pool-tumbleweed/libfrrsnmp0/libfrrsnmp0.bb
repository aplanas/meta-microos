SUMMARY = "FRRouting snmp library"
DESCRIPTION = "This library contains part of the net-snmp agentx implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrsnmp0-8.4-4.2.aarch64.rpm"
RPM_HASH = "20928f708f4b43e9afb8a6d7f431a8742599691698aa859889b98667664a3bf2f98fb0a947b3f2d58b4b7d77b0c898f4c1e26285ecfe16aed15de6451c49174a"

RPROVIDES:${PN} += "libfrrsnmp.so.0 \
libfrrsnmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40"

inherit rpm
