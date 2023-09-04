SUMMARY = "The configuration file for python-notebook-shim"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend. Common configuration \
file"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "jupyter-notebook-shim-0.2.3-2.1.noarch.rpm"
RPM_HASH = "3c59b3c218c76dfbd29b119ff077f6bcfba0d05d6fd87319a490474f8c75d7b2db5d4f0b34a1ef653d83da46c811ee3295a632f61bc79bbd3410630090993309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-shim \
juypter-notebook-shim"

RDEPENDS:${PN} += "python3dist-notebook-shim"

inherit rpm
