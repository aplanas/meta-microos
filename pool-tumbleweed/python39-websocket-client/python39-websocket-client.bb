SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python39-websocket-client-1.5.1-1.3.noarch.rpm"
RPM_HASH = "944ef61f0992edd40adb6eb0cc31d921868d715a1108422fd90bdc6abcb0b9942f19e58520ecb8976c81db025bb299cbeb4a92c1c4c42d19dbdf065b79167ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-websocket-client \
python39-websocket-client \
python39-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
