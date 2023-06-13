SUMMARY = "RabbitMQ AMQP language bindings for Erlang"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes the RabbitMQ AMQP language bindings for Erlang."
LICENSE = "MPL-2.0"

PV = "3.11.3"

RPM_NAME = "erlang-rabbitmq-client-3.11.3-1.3.aarch64.rpm"
RPM_HASH = "1dd6c471572e960bb005ff9a2e4053dc509388a1b7e2eb033ad2081f0a391cde6c2e246ea9eaa3cca71d0e1ef17ac6234c3e95247d3551fa817d1171167dd213"

RPROVIDES:${PN} += "erlang-gen_server2 \
erlang-rabbitmq-client \
erlang-rabbitmq-client(aarch-64)"

RDEPENDS:${PN} += "erlang"

inherit rpm
