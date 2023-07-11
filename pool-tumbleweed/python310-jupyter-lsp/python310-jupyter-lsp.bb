SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-jupyter-lsp-2.2.0-1.2.noarch.rpm"
RPM_HASH = "86deb8a40290be9558122847d8b075cdd4adef0863538c7d9b46d7d84ed96a631c3be4ee86b1817a97e895b03111f70573d4293fb13205ceb486d75de7c2a06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-lsp \
python310-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python310-jupyter-server"

inherit rpm
