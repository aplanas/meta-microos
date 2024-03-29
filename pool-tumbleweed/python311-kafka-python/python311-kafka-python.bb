SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python311-kafka-python-2.0.2-4.3.noarch.rpm"
RPM_HASH = "bed2c186ea956543111fce52073a06a469dfe8ab2cbe2effc0431fa9b5bcc69fc7c275df2cd75f55c975405e40ba0a38b99ea9a9904af309bdfeefaac96d9b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kafka-python \
python3.11dist-kafka-python \
python311-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
