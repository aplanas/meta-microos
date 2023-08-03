SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python310-jupyterlab-server-2.24.0-1.1.noarch.rpm"
RPM_HASH = "0f7158a52d9d12017adba98c9fc171d8ab9233dd91a0b0acb3da51a3666a0c5db09dc498a50c1b8393eed9a3bfe28cb07ed8b5222e209c043e282b06f242b75a"
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
