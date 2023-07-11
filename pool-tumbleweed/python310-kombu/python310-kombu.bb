SUMMARY = "AMQP Messaging Framework for Python"
DESCRIPTION = "An AMQP messaging framework for Python. \
 \
AMQP is the Advanced Message Queuing Protocol, an open standard protocol \
for message orientation, queuing, routing, reliability and security. \
 \
One of the most popular implementations of AMQP is RabbitMQ. \
 \
The aim of Kombu is to make messaging in Python as easy as possible by \
providing an idiomatic high-level interface for the AMQP protocol, and also \
provide proven and tested solutions to common messaging problems."
LICENSE = "BSD-3-Clause"

PV = "5.2.4"

RPM_NAME = "python310-kombu-5.2.4-5.3.noarch.rpm"
RPM_HASH = "b71f7327bdb61627bf72fc2cef7abfbc9289cce657532fba7621789bc5fb79286273e6935544eb43e305c5e8dc46646d38588126a42397e468a9cfdf80e06cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kombu \
python310-kombu \
python3dist-kombu"

RDEPENDS:${PN} += "python-abi \
python310-amqp \
python310-cached-property \
python310-importlib-metadata \
python310-setuptools \
python310-vine"

inherit rpm
