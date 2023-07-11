SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-python-lsp-jsonrpc-1.0.0-1.10.noarch.rpm"
RPM_HASH = "45adbc298ac14fd68e108aa327b94727c427f26b971246801354840cc9448bebb8c4f40f3c592b94196237b1bbd8fad161557f1eae6698963861c621eae83705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-lsp-jsonrpc \
python39-python-lsp-jsonrpc \
python3dist-python-lsp-jsonrpc"

RDEPENDS:${PN} += "python-abi \
python39-ujson"

inherit rpm
