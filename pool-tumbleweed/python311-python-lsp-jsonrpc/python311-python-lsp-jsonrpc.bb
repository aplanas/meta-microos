SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-python-lsp-jsonrpc-1.0.0-1.8.noarch.rpm"
RPM_HASH = "7ac9e5bb4a7d82b9cbabb3314664da9cc09ea212b8dd7aeece649dfa52fca8cfa63ee6284c1cbd916070ec432c8c65864c811f7414791150cf42c460139ec28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-lsp-jsonrpc) \
python311-python-lsp-jsonrpc \
python3dist(python-lsp-jsonrpc)"

RDEPENDS:${PN} += "python(abi) \
python311-ujson"

inherit rpm
