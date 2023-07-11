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

RPM_NAME = "python310-paho-mqtt-1.6.1-2.12.noarch.rpm"
RPM_HASH = "9db15b28a5945476770c7f9d4973b0cd838d96e11dd8d15608de3ea4bc483210ee9ccd57f9baaaebdef7de0619ce2092dea82f08602c12592eb6324adb327b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-paho-mqtt \
python310-paho-mqtt \
python3dist-paho-mqtt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
