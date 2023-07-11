SUMMARY = "Synproxy stats plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Synproxy stats."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-synproxy-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "58167a1178d329c348834084777a83dd2a2483f2a8fa064ff3424b39b44257ee7aa0c8a0d673bbe05dc8656aa88e0b9fc8ea32291857b22d54678a3936d00e81"

RPROVIDES:${PN} += "collectd-plugin-synproxy"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
