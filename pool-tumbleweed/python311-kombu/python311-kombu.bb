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

RPM_NAME = "python311-kombu-5.2.4-5.3.noarch.rpm"
RPM_HASH = "c7f30aec08bac68d531a82a9a434b4de8b1f8b11f5afcb57b3b700c07cd6047e61935b156df3ea5925c7f41fa999a88e511985fe4268e26562dd0b4176b86a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kombu \
python3.11dist-kombu \
python311-kombu \
python3dist-kombu"

RDEPENDS:${PN} += "python-abi \
python311-amqp \
python311-cached-property \
python311-importlib-metadata \
python311-setuptools \
python311-vine"

inherit rpm
