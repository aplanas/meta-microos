SUMMARY = "LSP for Jupyter Notebook/Lab server - Config"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server \
Jupyter config"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-lsp-2.2.0-2.1.noarch.rpm"
RPM_HASH = "2eaa6cd6786174429631e1199e4ac8a78d611a0c35de80129bbf536a9945bae031796d71154f61483b0c406cc79f6bb837bade9dcb5091c3a59d8ee2859c9cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-lsp"

RDEPENDS:${PN} += "python3dist-jupyter-lsp"

inherit rpm
