SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-ypy-websocket-0.8.2-1.3.noarch.rpm"
RPM_HASH = "326ad9d80b690105ec7c959e2ae4ee77f9e1702bc551413d2839355f6cb7a8ec72a87b5a5dd7564fed50d18804bb24d98b8564186d0aef486fb20bb6c13f48d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ypy-websocket) \
python311-ypy-websocket \
python3dist(ypy-websocket)"
RDEPENDS:${PN} += "(python311-aiosqlite >= 0.17.0 with python311-aiosqlite < 1) \
(python311-y-py >= 0.5.3 with python311-y-py < 0.6.0) \
python(abi) \
python311-aiofiles"

inherit rpm
