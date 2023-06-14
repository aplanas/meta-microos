SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-jupyterlab-templates-0.4.0-1.1.noarch.rpm"
RPM_HASH = "0c8db3f29885040ecbf83e9d85ee22f49530a2ee0deebbe31722a5a078e7186f690729dd66fe753d9a3a960da77312486614296b3a94b4435af4f686945a5dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyterlab-templates \
python311-jupyter-jupyterlab-templates \
python311-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python311-jupyterlab"

inherit rpm
