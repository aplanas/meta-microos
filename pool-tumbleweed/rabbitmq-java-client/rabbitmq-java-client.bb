SUMMARY = "Java AMQP client library"
DESCRIPTION = "The RabbitMQ Java client library allows Java code to interface to AMQP servers."
LICENSE = "GPL-2.0-or-later & MPL-1.1"

PV = "3.5.0"

RPM_NAME = "rabbitmq-java-client-3.5.0-4.3.noarch.rpm"
RPM_HASH = "6ced17cf73577a8155866a8b6d9efa672bf9019c60976b4716b62067d4af0ae42f0ec1e486ab1f68586219104790406e46463aa96aeacd9b1da016fe67c96442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-java-client"

RDEPENDS:${PN} += "apache-commons-io \
jakarta-commons-cli"

inherit rpm
