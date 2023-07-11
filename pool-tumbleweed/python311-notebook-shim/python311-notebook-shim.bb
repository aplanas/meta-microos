SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python311-notebook-shim-0.2.3-1.2.noarch.rpm"
RPM_HASH = "800ccfb46a6d86aaa4db63c682ebb77dd84aff8a20514596d5c07aef1cfea810475fff24eecefc0e34e4b7e95b09377b43f98cf50f876da501b84bac46c48a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notebook-shim \
python3.11dist-notebook-shim \
python311-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python311-jupyter-server >= 1.8 with python311-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
