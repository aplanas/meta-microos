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

RPM_NAME = "python39-kombu-5.2.4-5.3.noarch.rpm"
RPM_HASH = "aab848d2adaedae20aa036902f5342dc7af3170da92deff71659db14336b608e790aa032c64dc5c1dce6ec05da23c0ba9d74f86780593d6ad24ac3a03c55996a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kombu \
python39-kombu \
python3dist-kombu"

RDEPENDS:${PN} += "python-abi \
python39-amqp \
python39-cached-property \
python39-importlib-metadata \
python39-setuptools \
python39-vine"

inherit rpm
