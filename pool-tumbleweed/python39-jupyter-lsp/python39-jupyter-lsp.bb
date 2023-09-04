SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-jupyter-lsp-2.2.0-2.1.noarch.rpm"
RPM_HASH = "cb42c3551ee1277c36b40ba80c47ebdd5ad22ee83fd91f1433248619b94ad3898c5e29ce4843b83a62a285e7a460881789981e2bfd2b4d241c03776999b26fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-lsp \
python39-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python39-jupyter-server"

inherit rpm
