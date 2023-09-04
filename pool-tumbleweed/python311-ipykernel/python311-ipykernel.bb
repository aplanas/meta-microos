SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.25.1"

RPM_NAME = "python311-ipykernel-6.25.1-2.1.noarch.rpm"
RPM_HASH = "3557c58c68aa20acae4bd077328cadd15e89aa552bd12f2694a01b75f606f45cf5f93143956dc27f255c6d297db6f664f2f2462eff2dd067efb1f9b628e593a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipykernel \
python3-ipykernel \
python3-jupyter-ipykernel \
python3.11dist-ipykernel \
python310-ipykernel-doc \
python310-jupyter-ipykernel-doc \
python311-ipykernel \
python311-ipykernel-doc \
python311-jupyter-ipykernel \
python311-jupyter-ipykernel-doc \
python39-ipykernel-doc \
python39-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "jupyter-jupyter-client \
python-abi \
python311-comm \
python311-debugpy \
python311-ipython \
python311-jupyter-client \
python311-matplotlib-inline \
python311-nest-asyncio \
python311-packaging \
python311-psutil \
python311-pyzmq \
python311-tornado \
python311-traitlets"

inherit rpm
