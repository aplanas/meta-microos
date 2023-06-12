SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-python-lsp-jsonrpc-1.0.0-1.8.noarch.rpm"
RPM_HASH = "d89a90a9e813efd7273a006320cc18129c44de62634c1b725207a2437442d8932aa7343b2a9035b5ff12322851c40b9797b3bacb2c8c370e287d4a02bda3f8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-lsp-jsonrpc) \
python39-python-lsp-jsonrpc \
python3dist(python-lsp-jsonrpc)"
RDEPENDS:${PN} += "python(abi) \
python39-ujson"

inherit rpm
