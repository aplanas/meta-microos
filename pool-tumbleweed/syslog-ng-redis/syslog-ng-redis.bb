SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-redis-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "3e404718dee6efc653aac51df3ee0c3296e9550f38621633e03b26d220ad95f8e7bb69d9e132417a56a6c9ff935dbabbda8a9287cd6143b0e3c58ca4a8db044c"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
