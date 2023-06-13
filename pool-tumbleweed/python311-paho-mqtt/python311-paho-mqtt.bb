SUMMARY = "MQTT version 3.11 client class"
DESCRIPTION = "This code provides a client class which enable applications to connect to an \
MQTT broker to publish messages, and to subscribe to topics and receive \
published messages. It also provides some helper functions to make publishing \
one off messages to an MQTT server very straightforward. \
 \
The MQTT protocol is a machine-to-machine (M2M)/'Internet of Things' \
connectivity protocol. Designed as an extremely lightweight publish/subscribe \
messaging transport, it is useful for connections with remote locations where \
a small code footprint is required and/or network bandwidth is at a premium. \
 \
Paho is an Eclipse Foundation project."
LICENSE = "EPL-1.0"

PV = "1.6.1"

RPM_NAME = "python311-paho-mqtt-1.6.1-2.10.noarch.rpm"
RPM_HASH = "b96a55b53c776d1f410ae5c6848cd15ca2b87bc74305fd155c381b2dd7b2f0a0c6d0f7b8ccb77bec36b8a58aae6d787e69d42454621b0d40a135d8ff019609fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paho-mqtt) \
python311-paho-mqtt \
python3dist(paho-mqtt)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
