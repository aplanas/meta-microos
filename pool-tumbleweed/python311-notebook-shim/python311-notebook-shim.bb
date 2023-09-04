SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python311-notebook-shim-0.2.3-2.1.noarch.rpm"
RPM_HASH = "ceccc580a018293b57a1696a8efe395967a7e310c33e1935065113ae280e0e076f18fc149634b593b1aee0777f222e87d49a3b5e9955d6f9f7041f4e418975bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notebook-shim \
python3.11dist-notebook-shim \
python311-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python311-jupyter-server >= 1.8 with python311-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
