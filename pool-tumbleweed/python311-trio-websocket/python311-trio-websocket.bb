SUMMARY = "WebSocket library for Trio"
DESCRIPTION = "WebSocket library for Trio"
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python311-trio-websocket-0.10.3-1.3.noarch.rpm"
RPM_HASH = "4c60036f07c309734fbb8e020353abc33ce66042885fff06547f4b2f1b3711509aeb65935db52e99dfcb8528c7d79cd4a29cd111b17ed9391988c2d1d166141f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trio-websocket \
python3.11dist-trio-websocket \
python311-trio-websocket \
python3dist-trio-websocket"

RDEPENDS:${PN} += "python-abi \
python311-exceptiongroup \
python311-trio \
python311-wsproto"

inherit rpm
