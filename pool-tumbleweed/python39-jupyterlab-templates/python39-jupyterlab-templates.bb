SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-jupyterlab-templates-0.4.0-2.1.noarch.rpm"
RPM_HASH = "10278891e08dc31c145a29d82eae4aafd4935dee2c0491da1e8b48a1b9c81e3dc76abc819b1a05823d263e3466558591a0ea0bb133a2c34a096e202fac0b0b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-templates \
python39-jupyter-jupyterlab-templates \
python39-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python39-jupyterlab"

inherit rpm
