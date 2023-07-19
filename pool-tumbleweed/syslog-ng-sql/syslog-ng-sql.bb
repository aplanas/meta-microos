SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-sql-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "1c6a00384ddf54fe32e4b4eddf3b8d48fa2b450681df0adf640ceb89a061030bbd33374673f01862fec3ca9462b494ac17b5c4f6eba07856b3b2c852055883c3"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
