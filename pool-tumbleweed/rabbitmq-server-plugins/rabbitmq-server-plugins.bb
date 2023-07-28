SUMMARY = "Plugins for the RabbitMQ server"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes some plugins for the RabbitMQ server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-plugins-3.12.0-2.1.aarch64.rpm"
RPM_HASH = "2fbeea955d82e51ca6037ecff9a316670105f54cbd96d41abc825fe31ff235573bdbc3564f312f59272e58812cfd956e52b13473cf1f6003ad10b19e598c500c"

RPROVIDES:${PN} += "rabbitmq-server-plugins"

RDEPENDS:${PN} += "rabbitmq-server"

inherit rpm
