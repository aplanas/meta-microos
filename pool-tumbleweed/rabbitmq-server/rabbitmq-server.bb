SUMMARY = "A message broker supporting AMQP, STOMP and MQTT"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-3.12.0-2.1.aarch64.rpm"
RPM_HASH = "3b6f5671dd8aadd34a5664376bae542c556b20ed5759dab1918433013dd84b69a4b0592b7cd9128453c5ad2572f12da48aec429857117d60a9a93eb1747ce48c"

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
