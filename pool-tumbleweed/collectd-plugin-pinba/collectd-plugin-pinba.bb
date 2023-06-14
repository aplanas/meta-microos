SUMMARY = "Pinba Collector Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to receive and dispatch timing values from Pinba, a \
profiling extension for PHP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-pinba-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "b7949375257b3b5532ad96cef87d2a371d2fc4b95c1351b93e79727be4523b60b82fc57682a2314adb4d5e61153ecfde6d75b641d02b9441d749576bb18d274f"

RPROVIDES:${PN} += "collectd-plugin-pinba"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm
