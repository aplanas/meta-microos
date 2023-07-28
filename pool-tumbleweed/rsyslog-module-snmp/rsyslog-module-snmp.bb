SUMMARY = "SNMP support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability to send syslog messages as an SNMPv1 & \
v2c traps."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-snmp-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "0dd485c9763b3b29f517ddd498bd8e1db8a4f25c64bbe3268e0e6452d7afb7edb7272cddfc7a5f19cbdac140cbc87828232e71532f8ae2f9eb79ee64c4cd66da"

RPROVIDES:${PN} += "config-rsyslog-module-snmp \
rsyslog-module-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
rsyslog"

inherit rpm
