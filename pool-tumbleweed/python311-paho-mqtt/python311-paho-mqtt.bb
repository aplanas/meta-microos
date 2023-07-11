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

RPM_NAME = "python311-paho-mqtt-1.6.1-2.12.noarch.rpm"
RPM_HASH = "af82229782c2886606cb0289dd182ed2f3a42becbfab39bb66f3379a325a36f64d0ca55b053286a6f58780289b37ab3e69fc3291079e5bee4a0b5ff66ec91c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paho-mqtt \
python3.11dist-paho-mqtt \
python311-paho-mqtt \
python3dist-paho-mqtt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
