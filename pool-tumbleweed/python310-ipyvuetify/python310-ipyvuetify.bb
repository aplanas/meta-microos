SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python310-ipyvuetify-1.8.10-4.1.noarch.rpm"
RPM_HASH = "35446da209c47a860d38fd308779913a0b9ea5a23df61da5b5ed6651ae9d368efeed6e84e7a1372776d184cf8640b40d60204a54c9934558e2e1b3cc4f6cc231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyvuetify \
python310-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python310-ipyvue >= 1.7 with python310-ipyvue < 2 \
python-abi"

inherit rpm
