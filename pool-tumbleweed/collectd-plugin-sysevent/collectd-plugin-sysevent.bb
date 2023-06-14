SUMMARY = "Sysevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen to rsyslog events and submit matched values. \
."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-sysevent-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "3e7f5cfe78cc4b6678a1436eed9c92ab88630d51f85732b851ba7f96d051af0275919eaccedc3f1bb3d3a9c2d53a246995d11c2269f1535a8c190b21fc2baa87"

RPROVIDES:${PN} += "collectd-plugin-sysevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
