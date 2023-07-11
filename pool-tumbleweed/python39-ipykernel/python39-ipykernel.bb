SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.3"

RPM_NAME = "python39-ipykernel-6.23.3-1.1.noarch.rpm"
RPM_HASH = "c2d4399125143f8644b4bea0bf20b50432fdc33a5189c438e17ece46c962225a04afbbce16d5482893e925a5eca759695381311f419fe97eba47bc44faf5e832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipykernel \
python310-ipykernel-doc \
python310-jupyter-ipykernel-doc \
python311-ipykernel-doc \
python311-jupyter-ipykernel-doc \
python39-ipykernel \
python39-ipykernel-doc \
python39-jupyter-ipykernel \
python39-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "jupyter-jupyter-client \
python-abi \
python39-comm \
python39-debugpy \
python39-ipython \
python39-jupyter-client \
python39-matplotlib-inline \
python39-nest-asyncio \
python39-packaging \
python39-psutil \
python39-pyzmq \
python39-tornado \
python39-traitlets"

inherit rpm
