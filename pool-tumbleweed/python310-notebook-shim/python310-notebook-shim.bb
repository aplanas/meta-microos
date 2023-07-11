SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python310-notebook-shim-0.2.3-1.2.noarch.rpm"
RPM_HASH = "168fb90873422af4ab6e682ded25f6dcf034f0e715a912edd2ae7b22c7f86cfdad718d21bbe6d6f47e3b05b1399dece531171571e10c660f903c6f4fb49e9243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-notebook-shim \
python310-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python310-jupyter-server >= 1.8 with python310-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
