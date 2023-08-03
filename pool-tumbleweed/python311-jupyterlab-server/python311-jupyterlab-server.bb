SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python311-jupyterlab-server-2.24.0-1.1.noarch.rpm"
RPM_HASH = "cfa1785b77d42c501752399ad25f0c1fb22035efd7d5cb789114220c0d4c5323390bcf89e65d6c609f09b62595d4d574217a27839d3b6ad4dd03c75fced69284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-launcher \
jupyter-jupyterlab-server \
python3-jupyter-jupyterlab-launcher \
python3-jupyter-jupyterlab-server \
python3-jupyterlab-server \
python3.11dist-jupyterlab-server \
python311-jupyter-jupyterlab-launcher \
python311-jupyter-jupyterlab-server \
python311-jupyterlab-server \
python3dist-jupyterlab-server"

RDEPENDS:${PN} += "-python311-jupyter-server >= 1.21 with python311-jupyter-server < 3 \
python-abi \
python311-Babel \
python311-Jinja2 \
python311-json5 \
python311-jsonschema \
python311-packaging \
python311-requests"

inherit rpm
