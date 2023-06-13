SUMMARY = "Check MySQL/MariaDB database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a MySQL/MariaDB database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-mysql-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "364eb912810d4d59b0c8d8366de1d9cdf97183b0038923433eb4dffb50203ede418652f674403014ce920da42e37cdad40c9451811d22fddafcc095fb8257060"

RPROVIDES:${PN} += "monitoring-plugins-dbi-mysql \
monitoring-plugins-dbi-mysql(aarch-64) \
monitoring-plugins-dbi_backend \
nagios-plugins-dbi-mysql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-mysql \
monitoring-plugins-dbi"

inherit rpm
