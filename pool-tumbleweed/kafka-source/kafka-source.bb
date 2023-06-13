SUMMARY = "Source code of Apache Kafka"
DESCRIPTION = "Source code of the Kafka distributed streaming platform."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "kafka-source-2.1.0-3.10.aarch64.rpm"
RPM_HASH = "c5697051f4b123121e51e38d5f0aab7f4753fd783f49050ef1392ba65e2be3341ca305599bc12a9955fbd6d3c2eb784c55438423354389dd2621c0593987669c"

RPROVIDES:${PN} += "kafka-source \
kafka-source(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env"

inherit rpm
