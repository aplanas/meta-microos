SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python39-notebook-6.5.4-1.2.noarch.rpm"
RPM_HASH = "a6c4cde93bd903c7b1ae7a1ce79727f08a258885204de33d26bdde44818bab55f6ee375734ffb9bd8492262c01209e6135618ede3aa444105d2711e3d6f408a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notebook \
python39-jupyter-notebook \
python39-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python39-jupyter-client >= 5.3.4 with python39-jupyter-client < 8 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python39-Jinja2 \
python39-Send2Trash \
python39-argon2-cffi \
python39-ipykernel \
python39-ipython-genutils \
python39-jupyter-core \
python39-nbclassic \
python39-nbconvert \
python39-nbformat \
python39-nest-asyncio \
python39-prometheus-client \
python39-pyzmq \
python39-terminado \
python39-tornado \
python39-traitlets"

inherit rpm
