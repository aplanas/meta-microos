SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-2.23.0-1.3.noarch.rpm"
RPM_HASH = "f0f708be185552f2aa1bf43c454eacaccbdf838048ed86dde7216c4c5ec58cb7e827d6bf22f00985e4a90b7db315b944abb31a0dafd311854dd6bb5e305dc103"
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
