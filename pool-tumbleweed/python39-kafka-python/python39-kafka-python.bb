SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "python39-kafka-python-2.0.2-4.3.noarch.rpm"
RPM_HASH = "a1137d22457851fa3383f0a92cc382b929df7e7e5598c023068a33f4dbcf4cad7a305d809701300869e166e324187d6e492468221090ecb38aa8e81b0638d338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kafka-python \
python39-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
