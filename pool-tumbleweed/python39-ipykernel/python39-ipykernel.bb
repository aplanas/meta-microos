SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.1"

RPM_NAME = "python39-ipykernel-6.23.1-1.1.noarch.rpm"
RPM_HASH = "95072484524d0eeb957a9d259ba8a3dbc4a6a79fcb489869c2737e73d0a1701b8cd2910d962d3e62e4ac00178de166552df1a1ac47026b002f78f51464c37c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipykernel) \
python310-ipykernel-doc \
python310-jupyter-ipykernel-doc \
python310-jupyter_ipykernel-doc \
python311-ipykernel-doc \
python311-jupyter-ipykernel-doc \
python311-jupyter_ipykernel-doc \
python39-ipykernel \
python39-ipykernel-doc \
python39-jupyter-ipykernel-doc \
python39-jupyter_ipykernel \
python39-jupyter_ipykernel-doc \
python3dist(ipykernel)"

RDEPENDS:${PN} += "(python39-jupyter-core >= 5.1 or (python39-jupyter-core >= 4.12 with python39-jupyter-core < 5.0)) \
jupyter-jupyter-client \
python(abi) \
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
