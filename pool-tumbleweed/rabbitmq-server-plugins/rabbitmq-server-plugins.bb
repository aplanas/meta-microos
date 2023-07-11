SUMMARY = "Plugins for the RabbitMQ server"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes some plugins for the RabbitMQ server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-plugins-3.12.0-1.2.aarch64.rpm"
RPM_HASH = "8086d35367f25905d2e2549ee5dc09adb722c42a92c2a908b5e7946f4b0ea31081ee83a42cd2861bd66dd7fd27a4560542af90ed6e77f38e3dbd90aad03e5089"

RPROVIDES:${PN} += "rabbitmq-server-plugins"

RDEPENDS:${PN} += "rabbitmq-server"

inherit rpm
