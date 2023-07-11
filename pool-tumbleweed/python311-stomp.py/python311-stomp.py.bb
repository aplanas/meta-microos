SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python311-stomp.py-8.1.0-1.4.noarch.rpm"
RPM_HASH = "1d97f6c5e920153cd01fd5155eb3a390e2fef8000d4eb61af6736ce4af7ab38c76b8bffe66a8da334bf8714defd44e4d5904a699966a9d44495a98c79cd2ba80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomp.py \
python3.11dist-stomp-py \
python311-stomp.py \
python3dist-stomp-py"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python3.11dist-docopt \
python3.11dist-websocket-client \
update-alternatives"

inherit rpm
