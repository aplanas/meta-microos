SUMMARY = "LSP for Jupyter Notebook/Lab server - Config"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server \
Jupyter config"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-lsp-2.2.0-1.2.noarch.rpm"
RPM_HASH = "7c940544a2f1bcbc41c7c4dfba60b21927e5f3c79ae9966d2c399a7a6339b9de33cf9f6a83173d02f0c72c80c5968d2f458eff2970b3098a5c95e83cfa4545d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-lsp"

RDEPENDS:${PN} += "python3dist-jupyter-lsp"

inherit rpm
