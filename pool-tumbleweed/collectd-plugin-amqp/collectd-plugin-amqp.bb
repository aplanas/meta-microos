SUMMARY = "AMQP Plugin for collectd"
DESCRIPTION = "The AMQP plugin transmits or receives values collected by collectd via the \
Advanced Message Queuing Protocol (AMQP)."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-amqp-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "39a2f44500bd96c33ae7bf6c81827d3823f83826966efe0ccef8d5014bc481f0d663b1e7b305e9e2898f8af792ed91276dc380ca5d6b072e757ff461b371a97d"

RPROVIDES:${PN} += "collectd-plugin-amqp"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
librabbitmq.so.4 \
libyajl.so.2"

inherit rpm
