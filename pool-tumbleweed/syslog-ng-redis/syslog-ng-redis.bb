SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-redis-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "5fec36b3422534c09db2dfb8437ee06d86c43012edadd86dee50d20a19374b816d6dfa2153ac126110508ecb20a73a8bdbf2325f4dc2dfb3602097865435595f"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
