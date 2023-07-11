SUMMARY = "Check MySQL/MariaDB database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a MySQL/MariaDB database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-mysql-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "dc781c79be507a9595d444fc27e64b12ccdca06ebf699708f70adbffb2f6c3eec542b4ea2b16d42a450d5fdf84eb20ac747c3109febac93bf50282661f37c45b"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-mysql \
nagios-plugins-dbi-mysql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-mysql \
monitoring-plugins-dbi"

inherit rpm
