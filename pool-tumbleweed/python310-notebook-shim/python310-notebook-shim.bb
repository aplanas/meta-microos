SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python310-notebook-shim-0.2.3-1.1.noarch.rpm"
RPM_HASH = "aa2e3646195556dc8b70c37b2fe51cac95a0e56d7c45f29f240abcd54760878da40e4a2b9e4a5260101e87764a724e11b2ba303b4d18e1e54a3b21e451e643fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notebook-shim \
python3-notebook_shim \
python3.10dist(notebook-shim) \
python310-notebook-shim \
python310-notebook_shim \
python3dist(notebook-shim)"

RDEPENDS:${PN} += "(python310-jupyter_server >= 1.8 with python310-jupyter_server < 3) \
jupyter-notebook-shim \
python(abi)"

inherit rpm
