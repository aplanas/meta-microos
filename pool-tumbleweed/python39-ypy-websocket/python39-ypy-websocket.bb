SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-ypy-websocket-0.8.2-1.3.noarch.rpm"
RPM_HASH = "0ee0703de1f9f5e7e4e93cadcfe0c6441249fdd1b1451e2afdfb4d2a6a486635510cde8687d0ee2fc594433190ff77efab86257a5dbef61d2cfb6a2e7170822d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ypy-websocket) \
python39-ypy-websocket \
python3dist(ypy-websocket)"
RDEPENDS:${PN} += "(python39-aiosqlite >= 0.17.0 with python39-aiosqlite < 1) \
(python39-y-py >= 0.5.3 with python39-y-py < 0.6.0) \
python(abi) \
python39-aiofiles"

inherit rpm
