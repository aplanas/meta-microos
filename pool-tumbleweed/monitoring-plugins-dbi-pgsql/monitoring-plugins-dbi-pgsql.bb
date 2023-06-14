SUMMARY = "Check PostgreSQL database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a PostgreSQL database"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-pgsql-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "44c124bd5c034fe145b8359a3f160ee924bfc21d93a1054e3b4bc8cd602522bab195b9b699e4f6233cb25a5614440694f77dee29b77a0cf31e4466150c525fea"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-pgsql \
nagios-plugins-dbi-pgsql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-pgsql \
monitoring-plugins-dbi"

inherit rpm
