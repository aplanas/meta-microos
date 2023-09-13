SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-sql-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "0301ebe6b469d5ea1f6ac0d5ec8270eeb17e3b74ca52b32ac2f7d8c6b609bc6b3d40d5f141e19370b3f06cc6cdfa95929bf374eee5b1b844ec691a2f022ccabf"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
