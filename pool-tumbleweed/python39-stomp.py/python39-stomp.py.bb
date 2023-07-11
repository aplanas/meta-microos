SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python39-stomp.py-8.1.0-1.4.noarch.rpm"
RPM_HASH = "34f0761ed5d38c2a8156bba4da9980ae84d4497eb8d0444aa2b2b8afa0f27a5dad3cf10c147da520ff437a45bbb58bd39af2933ff47f51cb49351f7bf2f002d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stomp-py \
python39-stomp.py \
python3dist-stomp-py"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python3.9dist-docopt \
python3.9dist-websocket-client \
update-alternatives"

inherit rpm
