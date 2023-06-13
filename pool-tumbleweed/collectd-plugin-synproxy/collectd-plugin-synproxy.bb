SUMMARY = "Synproxy stats plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Synproxy stats."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-synproxy-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "71f225c42fe58a10b9a99db9c94093615e4d4f28e89fe1fc822c6219121059394ff23e7d2f717a87e2ce73b5a2b85c3efca34f0f6103530ee364980a85ef0465"

RPROVIDES:${PN} += "collectd-plugin-synproxy \
collectd-plugin-synproxy(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
