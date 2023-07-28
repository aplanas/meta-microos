SUMMARY = "MySQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides a module with the support for logging into MySQL \
databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-mysql-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "4abebd10243a76451bbef0438b8d12c732bdc1739f79fefbfe702cadcd4b0f09d682134af970b8462e743b9c7dd7aa5e544b1f9f8ec8242ff4e780adb4ad13f1"

RPROVIDES:${PN} += "config-rsyslog-module-mysql \
rsyslog-module-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
rsyslog"

inherit rpm
