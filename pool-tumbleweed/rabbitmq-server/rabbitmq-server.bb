SUMMARY = "A message broker supporting AMQP, STOMP and MQTT"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-3.12.0-1.2.aarch64.rpm"
RPM_HASH = "edf6f784900468789cab1e733176410adf39238a3fc8a4dfdda675f0173b183b03f937eeca0eb016753fdca9640b4c90d681782ef0aa22a3bb67308ef8dd42f9"

RPROVIDES:${PN} += "AMQP-server \
config-rabbitmq-server \
rabbitmq-server"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
erlang \
erlang-epmd \
fillup \
logrotate \
rabbitmq-server-plugins \
shadow"

inherit rpm
