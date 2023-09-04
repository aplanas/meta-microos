SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.25.1"

RPM_NAME = "python310-ipykernel-6.25.1-2.1.noarch.rpm"
RPM_HASH = "0c7dbd743c9284d82c85b774317a876ca2eb9ea280a64f7a2eadaceeb0be2f412b41ca0724f5f1a4d04bd316b13f1b5d3be44b5daeec2ab0195b4186f6d174c9"
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
