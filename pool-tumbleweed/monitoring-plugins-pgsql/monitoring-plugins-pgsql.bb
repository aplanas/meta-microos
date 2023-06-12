SUMMARY = "Test a PostgreSQL DBMS"
DESCRIPTION = "This plugin tests a PostgreSQL DBMS to determine whether it is active and \
accepting queries. It provides the check 'check_pgsql'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-pgsql-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "60d07b4ec6ca3218a4b94d7d149b4691b77ff335295fdad6512c7489d05c26694973697f60e04392417353eecf20a37438973cf9e1af45735324f99a0be59635"

RPROVIDES:${PN} += "monitoring-plugins-pgsql \
monitoring-plugins-pgsql(aarch-64) \
nagios-plugins-pgsql"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpq.so.5()(64bit)"

inherit rpm
