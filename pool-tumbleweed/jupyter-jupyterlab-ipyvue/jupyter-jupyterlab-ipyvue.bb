SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.9.2-2.1.noarch.rpm"
RPM_HASH = "07245283ad47044ab39b4c3850cfd76f0fd8086031acf7c285bb5c1aec2ffb2a98a794eb90d8fde24d5b1030522467f67d8b93af2b0aeecc5a231fa7759cae2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvue"

inherit rpm
