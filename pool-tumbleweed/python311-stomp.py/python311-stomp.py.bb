SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python311-stomp.py-8.1.0-1.3.noarch.rpm"
RPM_HASH = "425fe35d1c89107f639e0bc6cd4b955850f3917a6661313cdfcc11a9012743da54b38ce26e0220f987bd6c6e33b39515b05925e42302977ecffb5988e14bf2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-stomp-py \
python311-stomp.py \
python3dist-stomp-py"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python3.11dist-docopt \
python3.11dist-websocket-client \
update-alternatives"

inherit rpm
