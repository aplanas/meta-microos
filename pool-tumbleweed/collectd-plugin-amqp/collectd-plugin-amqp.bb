SUMMARY = "AMQP Plugin for collectd"
DESCRIPTION = "The AMQP plugin transmits or receives values collected by collectd via the \
Advanced Message Queuing Protocol (AMQP)."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-amqp-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "0de845745787dd1490a02d5e902743420d2f8bca0ee1ef1a2733ff00e34776628d5515aa5b2be1ea1b8e2111db681def6812ae343b5dde0bfff964bffe80a53e"

RPROVIDES:${PN} += "collectd-plugin-amqp \
collectd-plugin-amqp(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
librabbitmq.so.4()(64bit) \
libyajl.so.2()(64bit)"

inherit rpm
