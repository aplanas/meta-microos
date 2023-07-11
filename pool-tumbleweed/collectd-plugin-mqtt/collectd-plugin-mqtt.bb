SUMMARY = "MQTT Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send and receive MQTT messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mqtt-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "8ffb403d34b64055efb454a2aa78004fd9a2abb730e385506bb79b4dc3838850366f560e0f2bfb4389714d501fd07874974c236edd83cb22128d58eaa6fa5477"

RPROVIDES:${PN} += "collectd-plugin-mqtt"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmosquitto.so.1"

inherit rpm
