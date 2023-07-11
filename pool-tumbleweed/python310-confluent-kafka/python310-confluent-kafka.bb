SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python310-confluent-kafka-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "e9edc1475d82323f9f4616f4225759718860030d970734573c8a01e23b28c7f4459d0bc2a87091dd3ca1fe9b22f1162810acac07713431c8152a1993322b731a"

RPROVIDES:${PN} += "python3.10dist-confluent-kafka \
python310-confluent-kafka \
python3dist-confluent-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
python-abi"

inherit rpm
