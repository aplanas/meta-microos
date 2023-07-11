SUMMARY = "The configuration file for python-notebook-shim"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend. Common configuration \
file"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "jupyter-notebook-shim-0.2.3-1.2.noarch.rpm"
RPM_HASH = "978201bd577b2a813165a901e0b4cca6730d9375235117359c15506f183a81d08c56955ba43cae18a443f1d9f639658a7aaf41cdbbec5668d7840cead189dc52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-shim \
juypter-notebook-shim"

RDEPENDS:${PN} += "python3dist-notebook-shim"

inherit rpm
