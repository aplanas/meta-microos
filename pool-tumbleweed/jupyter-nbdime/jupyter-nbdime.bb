SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-14.1.noarch.rpm"
RPM_HASH = "b2cd44d23e3e53415283d843f97611005ef55ee5d3342bf2b10674d808298013e9f839bf0601c45dd2aea31514aa8758f8e8b8a443879864c3912ee70643f7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist-nbdime"

inherit rpm
