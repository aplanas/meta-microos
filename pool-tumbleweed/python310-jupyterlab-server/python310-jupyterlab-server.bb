SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-2.23.0-1.4.noarch.rpm"
RPM_HASH = "b9b9b68f0e07da89f99380695474a417d5197802d5ed032327e67100ea0008b51c27cfb637f397d37f5e64e5ee9a7f0a25196c2516c1fb1bf7e7046e0c85f046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-server \
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
