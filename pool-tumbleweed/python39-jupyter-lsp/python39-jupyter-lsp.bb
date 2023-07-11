SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-jupyter-lsp-2.2.0-1.2.noarch.rpm"
RPM_HASH = "6344cd30a1f7238666d7e7d1356aeff6a5063d48a356965e16d81970596c34abd98848a27c56acfb2ae652e02236b5e89cdd0b0221ca8d689823efa7dff232e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-lsp \
python39-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python39-jupyter-server"

inherit rpm
