SUMMARY = "Check databases using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This package provides the check_dbi plugin."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "aef6e5f2da153447e379954154c8af34c579b71e64b6c493d8e439bd50808c46aab77932f6a69795e0da53f0180dde36158a4117bf5849b843a8f12f250dfc5a"

RPROVIDES:${PN} += "monitoring-plugins-dbi \
nagios-plugins-dbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
monitoring-plugins-dbi-backend"

inherit rpm
