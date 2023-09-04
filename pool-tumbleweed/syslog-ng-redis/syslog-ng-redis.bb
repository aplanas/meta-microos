SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-redis-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "73d2b3e92c629e22ad39733926f606df1ba693d4d28a2bb89e49d1ca2ec1b2e67f4e625e0774f79b054db43277870da4a51d40dcd545699aedc49ce2db95c59c"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
