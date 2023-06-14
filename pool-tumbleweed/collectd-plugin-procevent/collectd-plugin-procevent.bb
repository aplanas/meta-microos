SUMMARY = "Procevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen for process starts and exits via netlink."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-procevent-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "d5baf3acb92cb794c760cd7320bf8cc76e9d92f50ec80ff65a049ff26567723c935169ca21c1edb2b9e91d1d73dc42d7dd283510a9b906826f16290e2d650f17"

RPROVIDES:${PN} += "collectd-plugin-procevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
