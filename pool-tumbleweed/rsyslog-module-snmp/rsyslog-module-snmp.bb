SUMMARY = "SNMP support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability to send syslog messages as an SNMPv1 & \
v2c traps."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-snmp-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "382215112a290352a7600977bf0e3da6de8b7c11f14016bd18efc0fd26cbb67138800e81a43428623d5a1e747f40602a0a88011f89297d0a1d175f098a8f6fd7"

RPROVIDES:${PN} += "config-rsyslog-module-snmp \
rsyslog-module-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
rsyslog"

inherit rpm
