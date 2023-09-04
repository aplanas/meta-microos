SUMMARY = "Jupyter widgets based on vuetify UI components - labextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-jupyterlab-ipyvuetify-1.8.10-4.1.noarch.rpm"
RPM_HASH = "298e52e6098badafa405c2e70c0b96d35b2c31ffa3f2adac2c27a301e22542c22d059a6d7fa33169dac1af7fc507db34b43b478a49a47b4d608d042d6a2286ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvuetify"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvuetify"

inherit rpm
