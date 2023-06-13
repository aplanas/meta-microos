SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python311-websocket-client-1.5.1-1.1.noarch.rpm"
RPM_HASH = "89a98c52766f6759394047c302953c4c1fed0f1a2d36c0f6144b6dcbc9852602a6a21bca835c7fcd54a59622b05013be7308d2c1a589ec9efd2609683337f0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(websocket-client) \
python311-websocket-client \
python311-websocket-client-test \
python3dist(websocket-client)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi)"

inherit rpm
