SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-pika-1.3.2-1.1.noarch.rpm"
RPM_HASH = "3f7f1841ddffdb4d623e1eb79675beb49d283064ffaf812e1314372b532ae7253bf7a078055b808f9c633c992381243fa32061ed9db2c2351a0571df7ba4071e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika \
python3.11dist-pika \
python311-pika \
python3dist-pika"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
