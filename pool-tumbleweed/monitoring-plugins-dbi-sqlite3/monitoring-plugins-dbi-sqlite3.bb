SUMMARY = "Check SQlite3 database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a SQlite database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-sqlite3-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "623d106abd79e5f03a052a7d5360d202579b75fa0750f970f9dbe43068ff71b604a6cf7501bd1f87dae5fd5109492d968700a40c48d0d63b7c5090e16b17facd"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-sqlite3 \
nagios-plugins-dbi-sqlite3"

RDEPENDS:${PN} += "libdbi-drivers-dbd-sqlite3 \
monitoring-plugins-dbi"

inherit rpm
