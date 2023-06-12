SUMMARY = "Jupyter widgets based on vuetify UI components - nbextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-ipyvuetify-nbextension-1.8.10-2.2.noarch.rpm"
RPM_HASH = "7a9d9c9d85a26648e5295749f0e724a9d5ecf6fec74f43d0ca7941cbe68044c92174e24364b4d47956444d61b96d86184a3df2b9dd360460cb14958ca19cc6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvuetify-nbextension"
RDEPENDS:${PN} += "jupyter-notebook \
python3dist(ipyvuetify)"

inherit rpm
