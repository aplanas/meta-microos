SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python311-websocket-client-1.5.1-1.3.noarch.rpm"
RPM_HASH = "739979339224ca30dce903323e2ad23b29b22f5c1f6b52c2ed24183f47f8a78177b90098684dddf8c21989361cfd3403cba8cad876f4bb75bf2d05c0ca0bef9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websocket-client \
python3-websocket-client-test \
python3.11dist-websocket-client \
python311-websocket-client \
python311-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
