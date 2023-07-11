SUMMARY = "Jupyter widgets based on vuetify UI components - labextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-jupyterlab-ipyvuetify-1.8.10-3.1.noarch.rpm"
RPM_HASH = "928cc5d9fd3a229889642e3c8e3d56df29f29ab61c350c336a760f78362c9264cdefecc82c40954a68f130a80b3f860e8bca165ca17cde6b13928595def64a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvuetify"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvuetify"

inherit rpm
