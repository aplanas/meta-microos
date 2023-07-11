SUMMARY = "Pinba Collector Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to receive and dispatch timing values from Pinba, a \
profiling extension for PHP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-pinba-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "bb6c60fd06cf3cf4661601eb27aec8007a27d427d8f44182d67df6b8e3c27e8152b4854dd742620712ee1f17a307988c6001b13517264f2d7266b76c7d436d39"

RPROVIDES:${PN} += "collectd-plugin-pinba"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm
