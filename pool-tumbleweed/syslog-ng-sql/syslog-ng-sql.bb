SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-sql-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "60ce2cc3dce903ccb83638d50f3ccf5105332d2497556d2396cf99e7f9434496c1e754ee01e54fe9f72bcf2c392328177c220134e3bdc2ded5a651e032360574"

RPROVIDES:${PN} += "syslog-ng-sql \
syslog-ng-sql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libsyslog-ng-4.2.so.0()(64bit) \
syslog-ng"

inherit rpm