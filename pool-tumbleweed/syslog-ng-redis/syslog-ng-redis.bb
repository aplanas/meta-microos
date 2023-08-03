SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-redis-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "b0cef240f0b85ccd82ae9bebc150cc77e9d240c6dc6b65653b21cabcfa27827a829405efd785988d40efa858f36e1689eac5bbe6380de4e60227596b61276ac6"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
