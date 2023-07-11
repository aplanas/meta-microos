SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python311-txaio-23.1.1-1.4.noarch.rpm"
RPM_HASH = "232d2ce55dfe05ab9f9d4063230c4a332c8b32889c1a48f8d166bdeec0b495474fa4eb3c9ccb1595249ebf4d16ff204399d15df678382988a797d06d91bb092e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txaio \
python3.11dist-txaio \
python311-txaio \
python3dist-txaio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
