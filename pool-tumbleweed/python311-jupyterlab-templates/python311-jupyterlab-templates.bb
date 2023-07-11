SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-jupyterlab-templates-0.4.0-2.1.noarch.rpm"
RPM_HASH = "375ee2f6055287a987b7182c411f1d2776a32f6727003510938c1bf21aaf699049f59f1c9e019ec7fd9445d68b3c5ecc30adc7d5399d69e8ac7462a001bf9a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-jupyterlab-templates \
python3-jupyterlab-templates \
python3.11dist-jupyterlab-templates \
python311-jupyter-jupyterlab-templates \
python311-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python311-jupyterlab"

inherit rpm
