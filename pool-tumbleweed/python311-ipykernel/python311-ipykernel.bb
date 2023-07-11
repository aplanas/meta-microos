SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.3"

RPM_NAME = "python311-ipykernel-6.23.3-1.1.noarch.rpm"
RPM_HASH = "99d6d99e93989ef27f945839555938f475abd750abffaa356b7be913effdaa7fe99c7737154b7c6dc7186a04de5149c0fc9c37a461451ca1ad875b0678a84ead"
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
