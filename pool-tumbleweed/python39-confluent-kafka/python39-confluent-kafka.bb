SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python39-confluent-kafka-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "39d4b20a6a47ce163fcba3c6392ada33d6ef09747f388ba4e5dec609e6d6878bbf064a1d760dbc6e5a4e8e4e29ca1bd21493108b61c1fd155e98ce9154c1b0f4"

RPROVIDES:${PN} += "python3.9dist(confluent-kafka) \
python39-confluent-kafka \
python39-confluent-kafka(aarch-64) \
python3dist(confluent-kafka)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
librdkafka.so.1()(64bit) \
python(abi)"

inherit rpm
