SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python310-ypy-websocket-0.8.4-1.3.noarch.rpm"
RPM_HASH = "c8752f709fe7f37f19371abf1c23cd3cb813c515416a0a89effb388693a405c7364f2dcd0dba549921435d5dbb3d966d1d465b9bc52eee97d74fb1cd064448b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ypy-websocket \
python310-ypy-websocket \
python3dist-ypy-websocket"

RDEPENDS:${PN} += "-python310-aiosqlite >= 0.17.0 with python310-aiosqlite < 1 \
-python310-y-py >= 0.6 with python310-y-py < 0.7 \
python-abi \
python310-aiofiles"

inherit rpm
