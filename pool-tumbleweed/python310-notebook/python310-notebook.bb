SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python310-notebook-6.5.4-1.1.noarch.rpm"
RPM_HASH = "786662ad456a7c2ee65d865c3ad4773795b372ed4d2a9ade0ea3cea0793820a89997c5fa68c956ec43effe716beb7f52b8e619aedf1d194db4158142179ffc8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-notebook \
python3-notebook \
python3.10dist-notebook \
python310-jupyter-notebook \
python310-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python310-jupyter-client >= 5.3.4 with python310-jupyter-client < 8 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python310-Jinja2 \
python310-Send2Trash \
python310-argon2-cffi \
python310-ipykernel \
python310-ipython-genutils \
python310-jupyter-core \
python310-nbclassic \
python310-nbconvert \
python310-nbformat \
python310-nest-asyncio \
python310-prometheus-client \
python310-pyzmq \
python310-terminado \
python310-tornado \
python310-traitlets"

inherit rpm
