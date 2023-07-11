SUMMARY = "SNMP support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability to send syslog messages as an SNMPv1 & \
v2c traps."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-snmp-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "5da2320364ca453d5b60f22c9fff7d11a50f9fe384598069ff1dceba4b9f0419944cf3ed2312de02c705f5eb57d3008dcdfc259a3b44f7b2c6957f81ea9c38a1"

RPROVIDES:${PN} += "config-rsyslog-module-snmp \
rsyslog-module-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
rsyslog"

inherit rpm
