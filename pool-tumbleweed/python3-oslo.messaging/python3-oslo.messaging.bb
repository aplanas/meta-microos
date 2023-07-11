SUMMARY = "OpenStack oslo.messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "14.3.1"

RPM_NAME = "python3-oslo.messaging-14.3.1-1.1.noarch.rpm"
RPM_HASH = "bceb522977b5344e93d829e313e4c16404c70b0c36ceb18fd5e46cbe583348cd946cce8ec3c1a325f2d99a6d533af672a036b6b9934e08d65f4fc1b4fffbdd09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging \
python3.11dist-oslo.messaging \
python3dist-oslo.messaging"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-WebOb \
python3-amqp \
python3-cachetools \
python3-debtcollector \
python3-futurist \
python3-greenlet \
python3-kombu \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.metrics \
python3-oslo.middleware \
python3-oslo.serialization \
python3-oslo.service \
python3-oslo.utils \
python3-stevedore"

inherit rpm
