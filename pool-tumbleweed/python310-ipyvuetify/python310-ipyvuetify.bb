SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python310-ipyvuetify-1.8.10-2.2.noarch.rpm"
RPM_HASH = "9273d2a3607024bad4a094837cfa387deaecc8970e412ad7d26b7d180af63cc6c48a4c2bc32d4e44c8f6bbf482097a942f7c810decf254bcaf302f7261ee4342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvuetify \
python3.10dist(ipyvuetify) \
python310-ipyvuetify \
python3dist(ipyvuetify)"

RDEPENDS:${PN} += "(python310-ipyvue >= 1.7 with python310-ipyvue < 2) \
python(abi)"

inherit rpm
