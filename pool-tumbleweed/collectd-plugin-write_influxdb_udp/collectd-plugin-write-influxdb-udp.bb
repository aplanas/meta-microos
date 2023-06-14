SUMMARY = "write_influxdb_udp plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send values to InfluxDB using line protocol via udp"
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_influxdb_udp-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "0764013b2d6c32a856d77963a57ed7bc2ded82618d50998c03baf83e0ae5e1d09202ea0f310ecaea18de0fd1b06b1dd3ff617ddeea35ce8ba3fa9b177e91cacc"

RPROVIDES:${PN} += "collectd-plugin-write-influxdb-udp"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
