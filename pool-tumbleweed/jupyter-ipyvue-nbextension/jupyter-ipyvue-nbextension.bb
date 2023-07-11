SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-ipyvue-nbextension-1.9.2-1.1.noarch.rpm"
RPM_HASH = "2765e8ed6f9f3b5244353e1fc983b6ddff6ce94d1af78604dedce8615a5c96a775f5ad82908d4e07406ca2935576ee91349c82edb4d5cfb33f53537a421a9e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvue"

inherit rpm
