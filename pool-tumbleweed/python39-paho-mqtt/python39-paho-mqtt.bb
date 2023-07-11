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

RPM_NAME = "python39-paho-mqtt-1.6.1-2.12.noarch.rpm"
RPM_HASH = "69e4e5fe482036708419b05d94991d50936a5a84e93960b3c281f872cebf5c8da138243f31171f6bfb56bea49466d56cdbf1be7c65574dd337a15cfb2f42991d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-paho-mqtt \
python39-paho-mqtt \
python3dist-paho-mqtt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
