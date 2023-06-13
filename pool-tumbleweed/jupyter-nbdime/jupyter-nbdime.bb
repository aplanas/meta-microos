SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-12.2.noarch.rpm"
RPM_HASH = "e3685e8343339554a61df28b3ef5bc30349172ab20e1e9d0a33b286c8ffd35eb12684c68f1cca0f375d81e246705a52e41e11fb85fd92489d3cb6260358813ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist(nbdime)"

inherit rpm
