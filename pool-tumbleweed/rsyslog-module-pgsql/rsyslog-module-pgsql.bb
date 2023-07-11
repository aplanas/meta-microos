SUMMARY = "PostgreSQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support for logging into PostgreSQL databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-pgsql-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "30a9a75ecdb4f8ae2ae25314a3a64695a3bd4899c44801e1528995fdeb3ff8c74c47f9508d25f8471047eee268f3f3a16350fdfa20c2a0e0e37a626740800956"

RPROVIDES:${PN} += "rsyslog-module-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
rsyslog"

inherit rpm
