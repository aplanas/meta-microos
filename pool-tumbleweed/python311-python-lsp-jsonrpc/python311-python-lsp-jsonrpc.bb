SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-python-lsp-jsonrpc-1.0.0-1.10.noarch.rpm"
RPM_HASH = "0b1526bc5e583c430fb738bb3f36479bab8579d8139ebd4b83fce5b323083a6a78ac5eddb4245a229e5de957baaedeae0dbe4e6a9a4f07961036562ae3f3356f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-jsonrpc \
python3.11dist-python-lsp-jsonrpc \
python311-python-lsp-jsonrpc \
python3dist-python-lsp-jsonrpc"

RDEPENDS:${PN} += "python-abi \
python311-ujson"

inherit rpm
