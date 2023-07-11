SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python311-notebook-6.5.4-1.2.noarch.rpm"
RPM_HASH = "48f8979298a1c82ac7c6ca10761fdf6a592f9fb3a294d6cf55e5d0d81b0322dc6321b4c0f624735508c82f8d272f6e13717ed96ba97506e7c6675f000f886ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-notebook \
python3-notebook \
python3.11dist-notebook \
python311-jupyter-notebook \
python311-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python311-jupyter-client >= 5.3.4 with python311-jupyter-client < 8 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python311-Jinja2 \
python311-Send2Trash \
python311-argon2-cffi \
python311-ipykernel \
python311-ipython-genutils \
python311-jupyter-core \
python311-nbclassic \
python311-nbconvert \
python311-nbformat \
python311-nest-asyncio \
python311-prometheus-client \
python311-pyzmq \
python311-terminado \
python311-tornado \
python311-traitlets"

inherit rpm
