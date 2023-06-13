SUMMARY = "OpenStack oslo.messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "14.2.0"

RPM_NAME = "python3-oslo.messaging-14.2.0-1.1.noarch.rpm"
RPM_HASH = "d1b01b08dafca37c48c5b1fa7f21b9cf316fe1d4af7f6982de3acd96ac3ff3204a1a84f214b7c365561a5fc7eac256d276b3df4c64d4c104236087926095acf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging \
python3.10dist(oslo.messaging) \
python3dist(oslo.messaging)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
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
