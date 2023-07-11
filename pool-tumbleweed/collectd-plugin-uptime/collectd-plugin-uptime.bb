SUMMARY = "Uptime plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect system uptime statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-uptime-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "ca6d234402ba3099cebcf9a44d90a1886a6e40904d1a0fdbb6e92612dcb530dd2e711e657a0877710b453709ebea8480b91a34f6290f3409df8cecc1aad49766"

RPROVIDES:${PN} += "collectd-plugin-uptime"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
