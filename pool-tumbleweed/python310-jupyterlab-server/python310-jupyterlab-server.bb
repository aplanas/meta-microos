SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-2.22.1-1.2.noarch.rpm"
RPM_HASH = "58c84fb315b460aa4df0a2a64f6f9cb0c85f2967c3c3dce93df53ea40b059a7a49975afb2f43025904cf4f07d980c63822fabb29dd2782b208bd90bd73556016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-launcher \
jupyter-jupyterlab-server \
python3-jupyter-jupyterlab-launcher \
python3-jupyter-jupyterlab-server \
python3-jupyterlab-server \
python3.10dist-jupyterlab-server \
python310-jupyter-jupyterlab-launcher \
python310-jupyter-jupyterlab-server \
python310-jupyterlab-server \
python3dist-jupyterlab-server"

RDEPENDS:${PN} += "-python310-jupyter-server >= 1.21 with python310-jupyter-server < 3 \
python-abi \
python310-Babel \
python310-Jinja2 \
python310-json5 \
python310-jsonschema \
python310-packaging \
python310-requests"

inherit rpm
