SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.1"

RPM_NAME = "python310-ipykernel-6.23.1-1.1.noarch.rpm"
RPM_HASH = "431378755e1994f959d5774b8035d43c60d42374f3d972b9afa59a88f3f2041926e56fe2f1260df48dd2d4bf88a75fe329f8237c69ad3cd5043e72f7fa6ddd65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipykernel \
python3-ipykernel \
python3-jupyter-ipykernel \
python3.10dist-ipykernel \
python310-ipykernel \
python310-ipykernel-doc \
python310-jupyter-ipykernel \
python310-jupyter-ipykernel-doc \
python311-ipykernel-doc \
python311-jupyter-ipykernel-doc \
python39-ipykernel-doc \
python39-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "-python310-jupyter-core >= 5.1 or (python310-jupyter-core >= 4.12 with python310-jupyter-core < 5.0) \
jupyter-jupyter-client \
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
