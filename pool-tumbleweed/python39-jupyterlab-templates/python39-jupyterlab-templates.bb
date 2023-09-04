SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python39-jupyterlab-templates-0.5.0-2.1.noarch.rpm"
RPM_HASH = "9b8effc77b6cc6bb48177e1b01a9ad544813b7604b60cd440886eed6b49efd5bf5d957c44d30f6fe9f0677d075050012d89d2a1400b0661e90497a9c3d1555c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-templates \
python39-jupyter-jupyterlab-templates \
python39-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python39-jupyterlab"

inherit rpm
