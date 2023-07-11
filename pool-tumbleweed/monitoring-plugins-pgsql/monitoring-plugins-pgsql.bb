SUMMARY = "Test a PostgreSQL DBMS"
DESCRIPTION = "This plugin tests a PostgreSQL DBMS to determine whether it is active and \
accepting queries. It provides the check 'check_pgsql'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-pgsql-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "72bb8f86be28e4f459a6909a8465a1b553d808a86a6e5bb17c5ed36717b5d65f1cd2f24bf1c7cf201df23f090601e14769b974b39262ee176d31796f0f5968be"

RPROVIDES:${PN} += "monitoring-plugins-pgsql \
nagios-plugins-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
