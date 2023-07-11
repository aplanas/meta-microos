SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-jupyter-lsp-2.2.0-1.2.noarch.rpm"
RPM_HASH = "eb20dcd9805a274f4f9a46aa8583f80cdb0dfea96ed924e4df9ce0318604a6852f9c12309680d8e28dceb44fdf04384f8702c5f623b1c27fcc5a46033428f369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-lsp \
python3.11dist-jupyter-lsp \
python311-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python311-jupyter-server"

inherit rpm
