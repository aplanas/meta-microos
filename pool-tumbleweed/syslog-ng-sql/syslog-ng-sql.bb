SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-sql-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "4440f54d2f781e2a5f078eb3f8d29b7b8abf429b6e75d108d6694d8b9fb804cd82438d1ec9db409d90dad8531c4bf665668d46f41a207acc68e9f3ab7928bb19"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
