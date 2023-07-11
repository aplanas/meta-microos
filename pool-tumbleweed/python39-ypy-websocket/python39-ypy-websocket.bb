SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python39-ypy-websocket-0.8.4-1.3.noarch.rpm"
RPM_HASH = "d1b197d6fb2f71f8c84383b0379bf4dce6585314e7c1abb2bff83c0d829cbcb4ba6700d6438fe06f16f5764ad99df01898c4b809a543e5e9b16c96511772065e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ypy-websocket \
python39-ypy-websocket \
python3dist-ypy-websocket"

RDEPENDS:${PN} += "-python39-aiosqlite >= 0.17.0 with python39-aiosqlite < 1 \
-python39-y-py >= 0.6 with python39-y-py < 0.7 \
python-abi \
python39-aiofiles"

inherit rpm
