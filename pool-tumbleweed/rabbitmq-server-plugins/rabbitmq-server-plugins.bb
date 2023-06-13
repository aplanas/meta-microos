SUMMARY = "Plugins for the RabbitMQ server"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes some plugins for the RabbitMQ server."
LICENSE = "MPL-2.0"

PV = "3.11.3"

RPM_NAME = "rabbitmq-server-plugins-3.11.3-1.3.aarch64.rpm"
RPM_HASH = "0ab1399f185898da2e7aeb00fdaae01bc9d6679016d74d5068b19dfa8a2382378ffc211a86e18a89415e5fa549735b71c7d65e3823e952684ea179eb362c918b"

RPROVIDES:${PN} += "rabbitmq-server-plugins \
rabbitmq-server-plugins(aarch-64)"

RDEPENDS:${PN} += "rabbitmq-server"

inherit rpm
