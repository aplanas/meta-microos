SUMMARY = "WebSocket library for Trio"
DESCRIPTION = "WebSocket library for Trio"
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python39-trio-websocket-0.10.3-1.3.noarch.rpm"
RPM_HASH = "3e982251485277ed427cb23186700d7c052a1fc31aa652fface5fb78f212964ec8416a44cd5f006260e0a1fa1693b8e99ece2bf55705f054e28b3206298e523e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trio-websocket \
python39-trio-websocket \
python3dist-trio-websocket"

RDEPENDS:${PN} += "python-abi \
python39-exceptiongroup \
python39-trio \
python39-wsproto"

inherit rpm
