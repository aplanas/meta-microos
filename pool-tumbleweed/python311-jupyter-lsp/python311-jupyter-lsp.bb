SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-jupyter-lsp-2.2.0-2.1.noarch.rpm"
RPM_HASH = "1340b48ab669812609ccff3536b7fa79d745fd4595515a3af4027c0328e665b97520d3587c37743de83a12c5fcce095842ecc470f65e20d5d44d94a637f93150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-lsp \
python3.11dist-jupyter-lsp \
python311-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python311-jupyter-server"

inherit rpm
