SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-2.23.0-1.3.noarch.rpm"
RPM_HASH = "21ffc723b7e132650d645971f01e3ea75c67889c13bf303b85e40b2bbda935673728e89d89472cc384caa9884ecb2eef0f3d93dcc26408f815a6cc0d93987717"
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
