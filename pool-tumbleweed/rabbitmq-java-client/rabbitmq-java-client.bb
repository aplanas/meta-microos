SUMMARY = "Java AMQP client library"
DESCRIPTION = "The RabbitMQ Java client library allows Java code to interface to AMQP servers."
LICENSE = "GPL-2.0-or-later & MPL-1.1"

PV = "3.5.0"

RPM_NAME = "rabbitmq-java-client-3.5.0-4.2.noarch.rpm"
RPM_HASH = "29bcb807bbe4bcbc892d2c5f8e8468974e637e5afb658069f39b3fd35b09f9a1eebc70816ead1dbb8c3cb5d8800367f3219b08eb8f3409b84a20a17108048c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-java-client"

RDEPENDS:${PN} += "apache-commons-io \
jakarta-commons-cli"

inherit rpm
