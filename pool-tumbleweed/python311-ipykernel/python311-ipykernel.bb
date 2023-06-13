SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.23.1"

RPM_NAME = "python311-ipykernel-6.23.1-1.1.noarch.rpm"
RPM_HASH = "80890aa33c25567ed2affcc8fdf23d069912fa25ed09f13d743c06b5080205efdc1c3962e6f776630d8e704da550e1dffd5a0543ab5339b1b2184e8aa0753ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipykernel) \
python310-ipykernel-doc \
python310-jupyter-ipykernel-doc \
python310-jupyter_ipykernel-doc \
python311-ipykernel \
python311-ipykernel-doc \
python311-jupyter-ipykernel-doc \
python311-jupyter_ipykernel \
python311-jupyter_ipykernel-doc \
python39-ipykernel-doc \
python39-jupyter-ipykernel-doc \
python39-jupyter_ipykernel-doc \
python3dist(ipykernel)"

RDEPENDS:${PN} += "(python311-jupyter-core >= 5.1 or (python311-jupyter-core >= 4.12 with python311-jupyter-core < 5.0)) \
jupyter-jupyter-client \
python(abi) \
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
