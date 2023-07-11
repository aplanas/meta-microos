SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-pika-1.3.2-1.1.noarch.rpm"
RPM_HASH = "26ce8a871d1fb4cf5cfbbaeeb6148564841c94fb28a7e9f5efa8386c20d4efd218273b1fb4f493be5741cb8ead695be48b7170e26c429e6dad23f7aca596cc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pika \
python310-pika \
python3dist-pika"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
