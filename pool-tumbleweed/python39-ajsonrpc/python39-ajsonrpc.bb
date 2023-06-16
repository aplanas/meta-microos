SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-ajsonrpc-1.2.0-2.4.noarch.rpm"
RPM_HASH = "6649eeb1b27f3a5641625313b0d3d42c7b2be9bf7cac466b04b9eb912af7441dc987b09b854f6a1e52cdbf8253fb8530e32569e95f282636953f0ae8f72b0bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ajsonrpc \
python39-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
