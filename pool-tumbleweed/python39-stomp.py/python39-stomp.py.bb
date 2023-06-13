SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python39-stomp.py-8.1.0-1.3.noarch.rpm"
RPM_HASH = "58f39740087e49bb4a0d3116a69e0d0562050988200a7cc58c07c11fe29d2a372dc06aafd6209cecb4fc19418bc3487af75858238a2a813d4b9177921b0b4150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stomp-py) \
python39-stomp.py \
python3dist(stomp-py)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python3.9dist(docopt) \
python3.9dist(websocket-client) \
update-alternatives"

inherit rpm
