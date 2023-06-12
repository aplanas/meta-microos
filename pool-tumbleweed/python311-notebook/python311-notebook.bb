SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python311-notebook-6.5.4-1.1.noarch.rpm"
RPM_HASH = "6c885aafcac81959720b73c0dc54a1053d88a68851fd9c34d78ea48a17770b5df0aa74f9065e0a77ec19bb66aba1b08a238e00f617b1fd2781bd95e4284a5333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(notebook) \
python311-jupyter_notebook \
python311-notebook \
python3dist(notebook)"
RDEPENDS:${PN} += "(python311-jupyter-client >= 5.3.4 with python311-jupyter-client < 8) \
/bin/sh \
/usr/bin/python3.11 \
alts \
jupyter-notebook \
python(abi) \
python311-Jinja2 \
python311-Send2Trash \
python311-argon2-cffi \
python311-ipykernel \
python311-ipython_genutils \
python311-jupyter-core \
python311-nbclassic \
python311-nbconvert \
python311-nbformat \
python311-nest-asyncio \
python311-prometheus_client \
python311-pyzmq \
python311-terminado \
python311-tornado \
python311-traitlets"

inherit rpm
