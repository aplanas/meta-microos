SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python310-stomp.py-8.1.0-1.4.noarch.rpm"
RPM_HASH = "d05d62d041ed95118ec330a9c3d7e81651f32f0f3d5e7e4b6e4e9620ef4f4c14991dca51002da00368d12d180a38100582b632e3329e104684dbdc5882a92ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stomp-py \
python310-stomp.py \
python3dist-stomp-py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3.10dist-docopt \
python3.10dist-websocket-client \
update-alternatives"

inherit rpm
