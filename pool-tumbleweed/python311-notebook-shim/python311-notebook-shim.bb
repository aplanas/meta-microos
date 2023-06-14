SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python311-notebook-shim-0.2.3-1.1.noarch.rpm"
RPM_HASH = "aa7a8d9b541d712746276a50508e7da70d10c465c3beab21235b66673bf487dd61e68b391358dc87fa5cb6b77860fc7b9e6dc871bb642ac7c11d6a0059b4b619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-notebook-shim \
python311-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python311-jupyter-server >= 1.8 with python311-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
