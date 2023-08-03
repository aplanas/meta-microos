SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python39-jupyterlab-server-2.24.0-1.1.noarch.rpm"
RPM_HASH = "2b859c3acb8275f8699353e8e7bbf8b2f603fef180487eb0e854b1282677b7e35b9728b6f1aefbe461e610843d2d7206359fab4d8e88f194d4e4b7f9693cffaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-server \
python39-jupyter-jupyterlab-launcher \
python39-jupyter-jupyterlab-server \
python39-jupyterlab-server \
python3dist-jupyterlab-server"

RDEPENDS:${PN} += "-python39-jupyter-server >= 1.21 with python39-jupyter-server < 3 \
python-abi \
python39-Babel \
python39-Jinja2 \
python39-importlib-metadata \
python39-json5 \
python39-jsonschema \
python39-packaging \
python39-requests"

inherit rpm
