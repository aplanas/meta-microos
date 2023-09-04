SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python310-jupyterlab-templates-0.5.0-2.1.noarch.rpm"
RPM_HASH = "0ba178a7192c65d00b5a7cd1c0e1299c929d8aab01cb56b61aafa1ce023d3775c2909160b35f9d8370f5013f9e2628c2b688fc266c25e7fbc709620f9dd3b48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-templates \
python310-jupyter-jupyterlab-templates \
python310-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python310-jupyterlab"

inherit rpm
