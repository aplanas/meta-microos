SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python39-notebook-shim-0.2.3-1.2.noarch.rpm"
RPM_HASH = "f25b62d517fc17da948d0f834a3c9aba55f9e8a71a048c3175fb6c4a8e58266ea4971126ef9673652dca8f128ae3640f096a2003706887f223b8b0a1d7a332cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notebook-shim \
python39-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python39-jupyter-server >= 1.8 with python39-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
