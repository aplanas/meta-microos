SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python310-websocket-client-1.5.1-1.3.noarch.rpm"
RPM_HASH = "102d43cdbd81c7894cd38061b81b78f6c85bf7c5e9503e40741bc04c61cf6bb830b7ba26241eb7ce05d40832a7c572162ff6a6d311923a079a07043b4760f8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-websocket-client \
python310-websocket-client \
python310-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
