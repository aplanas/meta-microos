SUMMARY = "Check SQlite3 database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a SQlite database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-sqlite3-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "7c13a5c8fe90dfccf75f6e5aa07da39d4bc02ac1dc620210737dde2ff35c8e7aa430bdbe0e8d87f140d9dd3fa892543eda8f687e9e1d468b7574d1604ca90bd0"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-sqlite3 \
nagios-plugins-dbi-sqlite3"

RDEPENDS:${PN} += "libdbi-drivers-dbd-sqlite3 \
monitoring-plugins-dbi"

inherit rpm
