SUMMARY = "Gateway between Kafka and Humio for Velociraptor Artifacts"
DESCRIPTION = "This tool is used to consume events generated by the Kafka Velociraptor plugin \
and post them to a Humio cluster."
LICENSE = "AGPL-3.0-only"

PV = "0.6.7.5~git81.01be570"

RPM_NAME = "velociraptor-kafka-humio-gateway-0.6.7.5~git81.01be570-3.2.aarch64.rpm"
RPM_HASH = "451758024fb90daa7e9c890f16e5d20ec0ef241f557d88f605a871cc4dc10f2cb179162a949ae62ca65299f514c66fc9b89986082fa8756ec0581998a9cc2295"

RPROVIDES:${PN} += "config-velociraptor-kafka-humio-gateway \
group-velociraptor-kafka \
user-velociraptor-kafka \
velociraptor-kafka-humio-gateway"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6"

inherit rpm
