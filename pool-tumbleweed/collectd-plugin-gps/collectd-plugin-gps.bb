SUMMARY = "GPSD monitoring plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor gpsd."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-gps-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "57736d649738f4bcb688c8c8e568408c39302acbc671f3b570949d91297966485b51ba0ae05d46301279b477a5353d50d5ba29051c485bba42c7935fc56adcfa"

RPROVIDES:${PN} += "collectd-plugin-gps"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgps.so.30"

inherit rpm
