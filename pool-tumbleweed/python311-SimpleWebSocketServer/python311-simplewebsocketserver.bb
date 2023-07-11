SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-SimpleWebSocketServer-0.1.1-2.15.noarch.rpm"
RPM_HASH = "e76809d921f3bb55cc9bc56d548579c75f5bd8ace28bc8f262c04f3ebf77781c05c6f5d34719ed77dc13f9afa1840dd191b3c61ae3be481787bb636f5a875f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SimpleWebSocketServer \
python3.11dist-simplewebsocketserver \
python311-SimpleWebSocketServer \
python3dist-simplewebsocketserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
