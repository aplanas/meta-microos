SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.3"

RPM_NAME = "python310-ipykernel-6.23.3-1.1.noarch.rpm"
RPM_HASH = "01183e7966c81c5b59600fd805348a7c5eacad5fc82758099c3f8ed0905ca2c6537b178bffa76b28373402eb66b3af1d2e09e3dee52fbb50207e61083fe1967d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipykernel \
python310-ipykernel \
python310-ipykernel-doc \
python310-jupyter-ipykernel \
python310-jupyter-ipykernel-doc \
python311-ipykernel-doc \
python311-jupyter-ipykernel-doc \
python39-ipykernel-doc \
python39-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "jupyter-jupyter-client \
python-abi \
python310-comm \
python310-debugpy \
python310-ipython \
python310-jupyter-client \
python310-matplotlib-inline \
python310-nest-asyncio \
python310-packaging \
python310-psutil \
python310-pyzmq \
python310-tornado \
python310-traitlets"

inherit rpm
