SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python39-confluent-kafka-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "044653684e97023182377b66d19fb5ae8e6f8946226b5e62abb16f94a84a9ca83fbd35d4951ece7f5e58c1c92bba207cdf36fc3a083f6b3b05b0dc881b26a7a4"

RPROVIDES:${PN} += "python3.9dist-confluent-kafka \
python39-confluent-kafka \
python3dist-confluent-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
python-abi"

inherit rpm
