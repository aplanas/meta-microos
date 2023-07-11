SUMMARY = "Open vSwitch (OVS) plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor an OVS database."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ovs-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "22c773086e4d97e1305af32f3dc847d4efb6cdf363323938922ecd86577180bb9b18c58053be6185d825cffe7a10b9ff4796e221fc1aee65e3b535a668bf4d22"

RPROVIDES:${PN} += "collectd-plugin-ovs"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
