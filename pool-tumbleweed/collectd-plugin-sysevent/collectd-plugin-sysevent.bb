SUMMARY = "Sysevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen to rsyslog events and submit matched values. \
."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-sysevent-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "e676c787394e1f07bcde82061beb4635f0859bbd3afdf52ca6e71fc17dbef0acb65512c8ab58800fa36c408e2e450d0aed4d92de59c844674c5494559a309f7d"

RPROVIDES:${PN} += "collectd-plugin-sysevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
