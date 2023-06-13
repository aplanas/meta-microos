SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-SimpleWebSocketServer-0.1.1-2.14.noarch.rpm"
RPM_HASH = "510922fd455d438e31a96fad677759f180ffbd5506242d4be0c17ba3fa59e1950f4089c55328ef4decb4b5f7b0c1fc6bd4280d45ba5deef48809c67e08a803a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(simplewebsocketserver) \
python311-SimpleWebSocketServer \
python3dist(simplewebsocketserver)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
