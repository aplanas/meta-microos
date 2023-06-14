SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python310-websocket-client-1.5.1-1.1.noarch.rpm"
RPM_HASH = "5198131a4c8081de21d9742cba1f2bde86792acc9dfc9436a1b2b3e6674e96c20e4f5947936fed1647346ed262eddc68242934a0fa1591612be12cb5d16dc6b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websocket-client \
python3-websocket-client-test \
python3.10dist-websocket-client \
python310-websocket-client \
python310-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi"

inherit rpm
