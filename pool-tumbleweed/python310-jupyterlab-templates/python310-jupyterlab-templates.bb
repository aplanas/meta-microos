SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-jupyterlab-templates-0.4.0-1.1.noarch.rpm"
RPM_HASH = "152191f67fd66ee683c8a2ce4b5fda54687021a3c1f08822b58b3e28cfe3f301a49d4dce416c4ad5fb9f6a906d85c49eb7e9b5c2ecb50fa061f95d82721d42ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_jupyterlab_templates \
python3-jupyterlab-templates \
python3.10dist(jupyterlab-templates) \
python310-jupyter_jupyterlab_templates \
python310-jupyterlab-templates \
python3dist(jupyterlab-templates)"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python(abi) \
python310-jupyterlab"

inherit rpm
