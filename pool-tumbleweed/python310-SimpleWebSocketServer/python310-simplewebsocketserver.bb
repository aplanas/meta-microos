SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-SimpleWebSocketServer-0.1.1-2.15.noarch.rpm"
RPM_HASH = "f72bbf6c7eae724ed180bbf0dbacbd58c031b12335d1baf64b4d5ebb00403308bed31e3a84b4d7aadcc49c90c25be16543706713a48511e4e909c9b8c524c91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-simplewebsocketserver \
python310-SimpleWebSocketServer \
python3dist-simplewebsocketserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
