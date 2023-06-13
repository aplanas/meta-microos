SUMMARY = "PostgreSQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PostgreSQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-postgresql-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "369a56ceaea27b66ffb497367dd784d26117d095fc92e4986d2bd34840fb1a8a0db9cc1fa59941e78a5b8b7fa2acfcb6d2972b9facd3a88dbf0e17a1d4527fef"

RPROVIDES:${PN} += "collectd-plugin-postgresql \
collectd-plugin-postgresql(aarch-64) \
config(collectd-plugin-postgresql)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit)"

inherit rpm
