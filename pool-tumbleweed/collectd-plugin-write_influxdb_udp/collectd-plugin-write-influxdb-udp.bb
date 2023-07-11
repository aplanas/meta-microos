SUMMARY = "write_influxdb_udp plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send values to InfluxDB using line protocol via udp"
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_influxdb_udp-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "f03c74d0f98af244d67bcdbb73e110a936e3406e098f699cd6c1e013a62b528dc6aa6a76ad5ca9b9a2a780db8049d0f34c3070f83dab831b152546e79d0f6085"

RPROVIDES:${PN} += "collectd-plugin-write-influxdb-udp"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
