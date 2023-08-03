SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-sql-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "ab87bb2d5027893c37a71f9c690c319f5404fdc53a805f40f77e53a557e2ee7776a1506bbec030a36da0202d684e78cc7ff745b4d1369fcb95685ac42729a359"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
