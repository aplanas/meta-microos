SUMMARY = "FRRouting snmp library"
DESCRIPTION = "This library contains part of the net-snmp agentx implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrsnmp0-8.4-5.1.aarch64.rpm"
RPM_HASH = "54072e4df25125a0321f0b7511ccaf1491e98aba749d56069a0bb1c173e2c88ef6e52c9ac3bc1410509056ac3a5f7e0c5c4ae58d040485c7a61780add9ca5f73"

RPROVIDES:${PN} += "libfrrsnmp.so.0 \
libfrrsnmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40"

inherit rpm
