SUMMARY = "Example tools built using the librabbitmq package"
DESCRIPTION = "This package contains example tools built using rabbitmq-c. It provides: \
amqp-consume        Consume messages from a queue on an AMQP server \
amqp-declare-queue  Declare a queue on an AMQP server \
amqp-delete-queue   Delete a queue from an AMQP server \
amqp-get            Get a message from a queue on an AMQP server \
amqp-publish        Publish a message on an AMQP server"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "rabbitmq-c-tools-0.13.0-2.1.aarch64.rpm"
RPM_HASH = "1567e2c64117c7bf5ab0ce085d106ebc32d20f73f3e7708a907472d5ac8095c36cc5589ca641cd8cace2a981094f0068c5e65a4fa1db4cb21d8bdd09a1c610d5"

RPROVIDES:${PN} += "rabbitmq-c-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0 \
librabbitmq.so.4"

inherit rpm
