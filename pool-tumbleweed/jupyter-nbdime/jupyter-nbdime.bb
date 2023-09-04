SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-15.1.noarch.rpm"
RPM_HASH = "cdff21f0d036b0d7694f0aa60742d8a47f6aa9969ae8a0373db5c5523903c26fff21881d28abef4a638b06163c515241da52e7e60dc4bb2383a6e151248e6cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist-nbdime"

inherit rpm
