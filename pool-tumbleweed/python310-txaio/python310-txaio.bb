SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python310-txaio-23.1.1-1.4.noarch.rpm"
RPM_HASH = "3413f6a3548d0833aaf389480b40b95d52c7da772641012bba551ead3f67d8cecfc746890ecc5577f60a60b56b708d0fb4f6fab5129ff97ff7c0ad8e21b1f5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txaio \
python310-txaio \
python3dist-txaio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
