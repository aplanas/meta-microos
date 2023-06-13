SUMMARY = "Jupyter widgets based on vuetify UI components - labextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-jupyterlab-ipyvuetify-1.8.10-2.2.noarch.rpm"
RPM_HASH = "354ab7e5408f1ea6dcbf4631fedf4c720adc59822b586e11cf18b59c6de5c29f7bc349bb95c4d525aeadfa3bdc3e1fd0aca27cc59a2d0c2032b61f631cbc84df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvuetify"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist(ipyvuetify)"

inherit rpm
