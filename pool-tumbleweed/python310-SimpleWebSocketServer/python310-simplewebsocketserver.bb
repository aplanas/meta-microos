SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-SimpleWebSocketServer-0.1.1-2.14.noarch.rpm"
RPM_HASH = "09f07de08b0a863a2a31ddecc5dcae418fd2eb13bb30a13824c9ff51e340c5b0fb315d374afcc0ff3adc47a9ebd4af03bc3c07b102091b364eb7bd32a4abfb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SimpleWebSocketServer \
python3.10dist(simplewebsocketserver) \
python310-SimpleWebSocketServer \
python3dist(simplewebsocketserver)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
