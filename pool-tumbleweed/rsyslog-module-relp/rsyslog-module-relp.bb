SUMMARY = "RELP protocol support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides Reliable Event Logging Protocol support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-relp-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "b3f46c786451a6fc6da44bfd6fee143a01f69fd93fe8a1ccebaa1cc90ce3060e58543750088de0494200980a4ba6cfd703daee26a29808fe7974b35588f579a9"

RPROVIDES:${PN} += "rsyslog-module-relp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librelp.so.0 \
rsyslog"

inherit rpm
