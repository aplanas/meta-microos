SUMMARY = "RabbitMQ AMQP language bindings for Erlang"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes the RabbitMQ AMQP language bindings for Erlang."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "erlang-rabbitmq-client-3.12.0-1.2.aarch64.rpm"
RPM_HASH = "e3ace988c49be313d6ff00d7606275aa900ea888420d8518ea0720aaf75552f1e83e2e9acb29d56c32345aa8e5c00c3154596e642a855453cf13a937a858cf5b"

RPROVIDES:${PN} += "erlang-gen-server2 \
erlang-rabbitmq-client"

RDEPENDS:${PN} += "erlang"

inherit rpm
