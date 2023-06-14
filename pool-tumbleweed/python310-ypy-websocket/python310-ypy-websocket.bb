SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-ypy-websocket-0.8.2-1.3.noarch.rpm"
RPM_HASH = "9a91af40a8898ec213daf6138cd09ce3f98fe1aed06d64bc14d36ff0edfaa430e4b50357d9563d8e1a8cb3a5aecca114cdb07eba961c8c264e264a2a2644d6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ypy-websocket \
python3.10dist-ypy-websocket \
python310-ypy-websocket \
python3dist-ypy-websocket"

RDEPENDS:${PN} += "-python310-aiosqlite >= 0.17.0 with python310-aiosqlite < 1 \
-python310-y-py >= 0.5.3 with python310-y-py < 0.6.0 \
python-abi \
python310-aiofiles"

inherit rpm
