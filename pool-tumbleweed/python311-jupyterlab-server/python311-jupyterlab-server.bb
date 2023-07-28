SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-2.23.0-1.4.noarch.rpm"
RPM_HASH = "81cc177d00d158588d628a65baa68ad236d65fad2136b1f20b4c43f71030551e683b5c5bedb3d0f82027e4b33d98ed86e7b67ef671f97f0734e8690bb92ba325"
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
