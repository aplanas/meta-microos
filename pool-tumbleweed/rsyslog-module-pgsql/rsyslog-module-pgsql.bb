SUMMARY = "PostgreSQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support for logging into PostgreSQL databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-pgsql-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "678707bc71421bec7af769653808742e000fdcb8807d10272eae2d84d76a1bbe101ca17e88e4d5bd00602697835d42ca1382d45e091ba7b33b6f0a8d5ea79175"

RPROVIDES:${PN} += "rsyslog-module-pgsql \
rsyslog-module-pgsql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
rsyslog"

inherit rpm
