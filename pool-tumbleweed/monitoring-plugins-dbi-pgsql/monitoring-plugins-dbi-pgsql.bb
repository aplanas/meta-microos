SUMMARY = "Check PostgreSQL database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a PostgreSQL database"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-pgsql-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "a4ed2480e3225d3ffb2da596a58eaccf52bf18e8e5eee1784d668ad0f0f2c4807413fc0d27dba7ac78fddc06ccdd861c0028a0912346f06a145e1f626d7acbdf"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-pgsql \
nagios-plugins-dbi-pgsql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-pgsql \
monitoring-plugins-dbi"

inherit rpm
