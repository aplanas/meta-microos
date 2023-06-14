SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python311-kafka-python-2.0.2-4.1.noarch.rpm"
RPM_HASH = "ac617b1c00445d1a885241ec776ae2c602104428252c3a8fe0aeff771a87dc2e98bdca983e647f0b390d9cff19ba73551a904d55722a125e4c5d5b8831dab886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-kafka-python \
python311-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
