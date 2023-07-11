SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python311-confluent-kafka-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "bf707ce8006bf4055443dc3880274013de3e124e332b7ff15c48dab2f96face82510eed65e73a759e3edeb9506e0fdfb1161b967d3145524ed3da999ad8e33c7"

RPROVIDES:${PN} += "python3-confluent-kafka \
python3.11dist-confluent-kafka \
python311-confluent-kafka \
python3dist-confluent-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
python-abi"

inherit rpm
