SUMMARY = "MySQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor MySQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mysql-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "ef24f2b883d3d7f399fb9f05f2933c69273fb80ce362e63d69e3abc7306fff154eeff437c620accd53166201053983738e2dbb48af0c6e4b53a85cfb0277c50d"

RPROVIDES:${PN} += "collectd-plugin-mysql"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
