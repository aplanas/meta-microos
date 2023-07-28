SUMMARY = "RabbitMQ AMQP language bindings for Erlang"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes the RabbitMQ AMQP language bindings for Erlang."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "erlang-rabbitmq-client-3.12.0-2.1.aarch64.rpm"
RPM_HASH = "02d45914aec063d4e5896913d1b5a7a7c7644a25ba843963e705f1dae5bdf1f926a427b023b4ee0214f894c55e494085218449631893d825a98cfea2815eb33a"

RPROVIDES:${PN} += "erlang-amqp-client \
erlang-gen-server2 \
erlang-rabbit-common \
erlang-rabbitmq-client"

RDEPENDS:${PN} += "erlang"

inherit rpm
