SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python310-notebook-shim-0.2.3-2.1.noarch.rpm"
RPM_HASH = "7b7f3d9e29c3c8a2e0a499b59fe6afeda121fc8bf8461efe4ac1a5e379cc848525f346ce3593ecaa456e26dbc2a7a058988952aa3a3e920532c8659bdcfdc83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-notebook-shim \
python310-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python310-jupyter-server >= 1.8 with python310-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
