SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-SimpleWebSocketServer-0.1.1-2.14.noarch.rpm"
RPM_HASH = "3ff5e4cff11c9d8a347060d9d3b977e99feda47061d1a3631e35e753a088c30367474cf7a9b3220508809792e6a983c0fa8f9f08603d3462880d0d0e1687df8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(simplewebsocketserver) \
python39-SimpleWebSocketServer \
python3dist(simplewebsocketserver)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
