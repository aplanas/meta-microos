SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.25.1"

RPM_NAME = "python39-ipykernel-6.25.1-2.1.noarch.rpm"
RPM_HASH = "e401e50b75c408595a215ab74a1690c8fbfd531e54b234d384fa1013df6bb85584c504a1961a48e0fe97caca01fb5173bfddbf78a10c8b27917f32fec95733ad"
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
