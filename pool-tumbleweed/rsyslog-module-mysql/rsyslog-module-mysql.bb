SUMMARY = "MySQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides a module with the support for logging into MySQL \
databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-mysql-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "925001afaf61598ff266b0c960b658cf259b175e35c941ff917992e1070357735f57386609ea2e27beaf074858d2bd7292c2b91e5d9b1cdd7159f9b410a95c4b"

RPROVIDES:${PN} += "config-rsyslog-module-mysql \
rsyslog-module-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
rsyslog"

inherit rpm
