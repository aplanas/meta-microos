SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python310-kafka-python-2.0.2-4.3.noarch.rpm"
RPM_HASH = "fa23721e4d454cc6a0369fe5bb0e9e602afb363e8683b8030270289945bf693e3b4192f6d5a8743440e8ee0cbd015f674f12a07b911d1cf713e207baf802ecc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kafka-python \
python310-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
