SUMMARY = "RELP protocol support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides Reliable Event Logging Protocol support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-relp-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "6a2e11e571c4aeaa02781cc21003ce0b8a7886d581d793bde1a87c5500410063a2b1556548903bf87992c6f1366ffe42b9febc2470a170232db6ca6b2dfc3afe"

RPROVIDES:${PN} += "rsyslog-module-relp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librelp.so.0 \
rsyslog"

inherit rpm
