SUMMARY = "Uptime plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect system uptime statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-uptime-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "78754ee8022ed64ad258c6170b2bd73af97b6f50638f24af9b78a62af85055bb99ab498a5d3009b00243625533f71dcef5317b80d29a30d53a10e0ce97e3aaf8"

RPROVIDES:${PN} += "collectd-plugin-uptime \
collectd-plugin-uptime(aarch-64)"
RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
