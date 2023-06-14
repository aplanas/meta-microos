SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "jupyter-jupyterlab-templates-0.4.0-1.1.noarch.rpm"
RPM_HASH = "0f9b08d64f98d953239b4128a0d84311a568eb0d97627a9d30e40b1afc640cd536b0b5c2d02c38289a82a74c816845c18fe43d3c5b9ad258fe2b08cc01430906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-jupyterlab-templates"

inherit rpm
