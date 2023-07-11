SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-redis-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "c62561ca70a14624e0ab046135d8577b982ef81d757e7ba80091397e801a4621673d7c0c0186b3f31b2e8313bbcb6ee389e9c8423d495e2f7ce2f90bf1875ffc"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
