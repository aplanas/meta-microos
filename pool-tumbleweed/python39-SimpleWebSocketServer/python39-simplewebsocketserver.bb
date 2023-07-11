SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-SimpleWebSocketServer-0.1.1-2.15.noarch.rpm"
RPM_HASH = "574595546774d6e48435f4fb436a059bf5ea42e3d9f195a8ba202d8fd009b3822784ce25534d44b26bd8adbd713dbcb479c93a1b6bab58f84397c2ae0f807b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-simplewebsocketserver \
python39-SimpleWebSocketServer \
python3dist-simplewebsocketserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
