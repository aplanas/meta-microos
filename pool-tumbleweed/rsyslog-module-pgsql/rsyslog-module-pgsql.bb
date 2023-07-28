SUMMARY = "PostgreSQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support for logging into PostgreSQL databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-pgsql-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "d990c273ba50507f6183930b799fed4070bce83e5da48dcb91eb0dbe49a9f035917b3ef38795faddceba5d32819d6a79711726300c0600f5c5cff4e2d07fb057"

RPROVIDES:${PN} += "rsyslog-module-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
rsyslog"

inherit rpm
