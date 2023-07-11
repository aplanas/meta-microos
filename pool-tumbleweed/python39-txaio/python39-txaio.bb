SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python39-txaio-23.1.1-1.4.noarch.rpm"
RPM_HASH = "1f659b6d6b8d7f33dccc3c048e3b5e2477fa3562700a39b1f89c4c4cd8651ce7296e507a50737657873bcfed949789a17fa5faf6bfac62ade9a2959b8664f340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txaio \
python39-txaio \
python3dist-txaio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
