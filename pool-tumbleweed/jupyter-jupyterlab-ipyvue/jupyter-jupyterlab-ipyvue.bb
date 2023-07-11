SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.9.2-1.1.noarch.rpm"
RPM_HASH = "90b179202a9861c7a3c32c2ea692fa290fbf58f93621b9720a0bbf3641125537ed43aaaa0cde0479000f79767c92e9bad2ea366c369b6fc5bd4f2112b31862db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvue"

inherit rpm
