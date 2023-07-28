SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-13.1.noarch.rpm"
RPM_HASH = "dac471d5bcd99ede6f78fd0e7ede96c254867aca4ec5ddafb83a85576decd2ed6fe191458cc19fed9062a007dbf8a5b379fed74bafc947272d830814d4005f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist-nbdime"

inherit rpm
