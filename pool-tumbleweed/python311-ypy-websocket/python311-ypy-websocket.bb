SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python311-ypy-websocket-0.8.4-1.3.noarch.rpm"
RPM_HASH = "fcbf996e4c28e12da0e6c2a0119f82eee4a1b095d766ddfd858475df533dd22eb5c86c476986c38e9f5616c92608336a84cfa7a83e0f96f24a001aa811119484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ypy-websocket \
python3.11dist-ypy-websocket \
python311-ypy-websocket \
python3dist-ypy-websocket"

RDEPENDS:${PN} += "-python311-aiosqlite >= 0.17.0 with python311-aiosqlite < 1 \
-python311-y-py >= 0.6 with python311-y-py < 0.7 \
python-abi \
python311-aiofiles"

inherit rpm
