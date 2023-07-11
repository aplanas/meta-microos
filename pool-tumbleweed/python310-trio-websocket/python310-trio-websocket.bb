SUMMARY = "WebSocket library for Trio"
DESCRIPTION = "WebSocket library for Trio"
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python310-trio-websocket-0.10.3-1.3.noarch.rpm"
RPM_HASH = "314f6ac65b5370aa98681bb0721990f619f057f49688c8202f8199185a70ec06d062b13ab7e6eb0c409c1c620a6831e8b819da3cec0f7ff25bfd5594bbc33a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trio-websocket \
python310-trio-websocket \
python3dist-trio-websocket"

RDEPENDS:${PN} += "python-abi \
python310-exceptiongroup \
python310-trio \
python310-wsproto"

inherit rpm
