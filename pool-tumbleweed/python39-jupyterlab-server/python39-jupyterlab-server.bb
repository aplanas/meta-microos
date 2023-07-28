SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python39-jupyterlab-server-2.23.0-1.4.noarch.rpm"
RPM_HASH = "a753b0b3003edbc98989bff99fdfb3a8f5d3160a2a71dcebf367439bf707aa3dbda180c1dde73351d1563960c942a3f194c118ba29718f4a6281d68cf49902d6"
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
