SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.9.2-1.2.noarch.rpm"
RPM_HASH = "941843ad3640dfcc20ea1062608208483c2364592a0b4261f779e83ade494013c9e12981f9979a59d0c576a0ec39f5a5884b8e650453761fb5c7541dc7c73d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvue"

inherit rpm
