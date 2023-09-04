SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-jupyter-lsp-2.2.0-2.1.noarch.rpm"
RPM_HASH = "1f2f0298fcd35e3b3c33fed66df708e6953d626ca645be803f8db3f52f9a414e440686f0f66cf89b0e070bbf09ca9204c679b7ad36de95b59b9e692ed5592791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-lsp \
python310-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python310-jupyter-server"

inherit rpm
