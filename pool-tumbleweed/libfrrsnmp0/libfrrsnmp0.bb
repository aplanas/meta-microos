SUMMARY = "FRRouting snmp library"
DESCRIPTION = "This library contains part of the net-snmp agentx implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrsnmp0-8.4-4.1.aarch64.rpm"
RPM_HASH = "9e8d8365e9bd2fba4422932eef621bc24bc81f9f244a515d9166bbb4fd876fc47030d139dc05d71a48d2d47899d8328d11dd0dcab6747cfa7c5635e9439b8bd9"

RPROVIDES:${PN} += "libfrrsnmp.so.0()(64bit) \
libfrrsnmp0 \
libfrrsnmp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit)"

inherit rpm
