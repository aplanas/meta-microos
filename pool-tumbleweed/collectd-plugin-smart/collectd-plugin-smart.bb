SUMMARY = "SMART Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Self-Monitoring, Analysis and Reporting \
Technology (SMART) information from disk drives."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-smart-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "8a336fcb5e416ba8cdf1b35f058a6e0d2498c953ca3f5538ba93fff1d5499aa774ebd4d062ceca2289a5e9d049db0af01dc15599b4f70e6d8484ef8d68048915"

RPROVIDES:${PN} += "collectd-plugin-smart"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libudev.so.1"

inherit rpm
