SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python311-jupyterlab-templates-0.5.0-2.1.noarch.rpm"
RPM_HASH = "4befdf34e41c3a61bd15f56149da17c208089b3a7d210a18ebcaf1ea4b3cea59b5b21a90afae8ffe0d5009d92f522b5b17a0d112635b2aadf5605d31a1b1f685"
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
