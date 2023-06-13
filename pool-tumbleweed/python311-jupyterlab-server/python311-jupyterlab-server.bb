SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-2.22.1-1.2.noarch.rpm"
RPM_HASH = "bb41df5fc08cc1164af9e864ff149aadfbd5cd2d7ac87a56a847d266d6775554ab5b41b7ecba5941485a64ec38c574efcdbd60583fa8da99e2e93463a79fdc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyterlab-server) \
python311-jupyter-jupyterlab-server \
python311-jupyter_jupyterlab_launcher \
python311-jupyter_jupyterlab_server \
python311-jupyterlab-server \
python311-jupyterlab_server \
python3dist(jupyterlab-server)"

RDEPENDS:${PN} += "(python311-jupyter-server >= 1.21 with python311-jupyter-server < 3) \
python(abi) \
python311-Babel \
python311-Jinja2 \
python311-json5 \
python311-jsonschema \
python311-packaging \
python311-requests"

inherit rpm
