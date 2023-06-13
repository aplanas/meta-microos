SUMMARY = "Example tools built using the librabbitmq package"
DESCRIPTION = "This package contains example tools built using rabbitmq-c. It provides: \
amqp-consume        Consume messages from a queue on an AMQP server \
amqp-declare-queue  Declare a queue on an AMQP server \
amqp-delete-queue   Delete a queue from an AMQP server \
amqp-get            Get a message from a queue on an AMQP server \
amqp-publish        Publish a message on an AMQP server"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "rabbitmq-c-tools-0.11.0-3.7.aarch64.rpm"
RPM_HASH = "a714a2cd976a9c760fde38bd9728685a1f737dc1e9a8fcffd4164144046a89861923f33696d8e19a1d86ab3b512b09a93af9c8500e906f83fb21ff51948a70ff"

RPROVIDES:${PN} += "rabbitmq-c-tools \
rabbitmq-c-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
librabbitmq.so.4()(64bit)"

inherit rpm
