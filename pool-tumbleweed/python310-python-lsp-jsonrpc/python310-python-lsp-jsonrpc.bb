SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-python-lsp-jsonrpc-1.0.0-1.10.noarch.rpm"
RPM_HASH = "90f861ccd15f17b6286e4e3f782ffa5a422b89b355735fae536e0524a116bfdd93cf6a86b47d30b9a9e9df36135c270a616605b14344b62ef176772b975fbcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-lsp-jsonrpc \
python310-python-lsp-jsonrpc \
python3dist-python-lsp-jsonrpc"

RDEPENDS:${PN} += "python-abi \
python310-ujson"

inherit rpm
