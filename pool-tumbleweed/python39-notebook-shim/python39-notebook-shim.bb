SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python39-notebook-shim-0.2.3-2.1.noarch.rpm"
RPM_HASH = "a0fd39f2a44380ecf1859fc9c3c5cb5219fd57e311683af1e1c40c24ed7d5858706e37a3892f9c2d6a645ca992b4a25b578505e2bef2e726d660606225870e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notebook-shim \
python39-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python39-jupyter-server >= 1.8 with python39-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
