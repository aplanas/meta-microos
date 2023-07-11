SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-pika-1.3.2-1.1.noarch.rpm"
RPM_HASH = "a74de54c670759473b18f9d0e4136cb12a47f6a014cea3a4a57deed4f8ebf93bd3b29e5fcba97671730d36b55394609ce3809ccb0a87b16fd07f90aaa5179008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pika \
python39-pika \
python3dist-pika"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
