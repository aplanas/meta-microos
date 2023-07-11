SUMMARY = "Jupyter widgets based on vuetify UI components - nbextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-ipyvuetify-nbextension-1.8.10-3.1.noarch.rpm"
RPM_HASH = "e40d393513f18b380bdedbecd46823cb8629be2070377766c37622d2aa31d4d0aee8fca7516b7c6d5bf2972c4596190120468deb218afbc3968f07c7c023a215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvuetify-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvuetify"

inherit rpm
