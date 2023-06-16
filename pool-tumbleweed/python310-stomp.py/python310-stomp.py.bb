SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python310-stomp.py-8.1.0-1.3.noarch.rpm"
RPM_HASH = "c65aee470580b4bf53b6251142b5310da658349d27e122385ac9d65bffee2bcc5055b1fa3025f8109285245b5b1caaaad2d25dcbbd1653519e72658a16b95d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomp.py \
python3.10dist-stomp-py \
python310-stomp.py \
python3dist-stomp-py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3.10dist-docopt \
python3.10dist-websocket-client \
update-alternatives"

inherit rpm
