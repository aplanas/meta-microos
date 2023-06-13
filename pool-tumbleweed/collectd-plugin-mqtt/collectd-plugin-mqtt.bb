SUMMARY = "MQTT Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send and receive MQTT messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mqtt-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "c0602c7b48bbeef76cd8d1502e7570ae6fba38ce2ee18dd89b2fbf1ac17ae2ae1318bac3a19a271c06f09ef327864c879d28bf5dc69c4195d6a469163ecef982"

RPROVIDES:${PN} += "collectd-plugin-mqtt \
collectd-plugin-mqtt(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmosquitto.so.1()(64bit)"

inherit rpm
