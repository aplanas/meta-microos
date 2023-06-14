SUMMARY = "The configuration file for python-notebook-shim"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend. Common configuration \
file"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "jupyter-notebook-shim-0.2.3-1.1.noarch.rpm"
RPM_HASH = "36ffb76d61c72a5f5573bc8df38d5f55e3f564d9e1cd70fac0e068026e470769ac46296261b0ffeac61bf378ca9a92aa52d307fbaed6ef65d4bda012e7461a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-shim \
juypter-notebook-shim"

RDEPENDS:${PN} += "python3dist-notebook-shim"

inherit rpm
