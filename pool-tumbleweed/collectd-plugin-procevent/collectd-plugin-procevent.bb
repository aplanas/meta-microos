SUMMARY = "Procevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen for process starts and exits via netlink."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-procevent-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "8f5a1d5e1dd56478e2011c2065d55f3615a43e6b040bbadc40f22514b579159bf50d09ffd92ff3ac72e1e4df45802c966aaef23d76f35283d9b9f7040957aaaf"

RPROVIDES:${PN} += "collectd-plugin-procevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
