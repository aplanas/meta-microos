SUMMARY = "Jupyter widgets based on vuetify UI components - nbextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-ipyvuetify-nbextension-1.8.10-4.1.noarch.rpm"
RPM_HASH = "c972f5933ec7e6c86c294ddda8e56b66f51e1f2b71772352759bee53d7673202b35bb56fb746e565b7a3fceb39ef7c39b1b347c13e7a5df4772147233756fd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvuetify-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvuetify"

inherit rpm
