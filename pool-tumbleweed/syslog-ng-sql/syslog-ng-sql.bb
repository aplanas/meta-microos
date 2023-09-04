SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-sql-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "93a2c4e2158330cd1c067175276cbf2fa1caa6b46e82e53e5ce9ce0abee79bdb313050e201547cd08bb472f6d3bd141081ba09e9eced7cb1749e117498fd87cb"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
