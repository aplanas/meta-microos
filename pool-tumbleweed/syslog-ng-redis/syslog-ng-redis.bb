SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-redis-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "76c1c9d079417a13f4836f82e40a902ec29f0c7cc151b8ff509b9bd748280a9b5908810e7517283f2373e6408abd673f11c9f8d81b688bc2636ccd2ec6339ea2"

RPROVIDES:${PN} += "syslog-ng-redis \
syslog-ng-redis(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhiredis.so.1.1.0()(64bit) \
libsyslog-ng-4.2.so.0()(64bit) \
syslog-ng"

inherit rpm