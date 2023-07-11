SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python310-ipyvuetify-1.8.10-3.1.noarch.rpm"
RPM_HASH = "e9252778cc69fdfd7f05efb3d2b506c5869fb3b166b34b553b895f73e99234dcb5f69809ceb3d0ddfd906ff7d41bb90d4b23a3aa5cf4944517e1b8c19fda7955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyvuetify \
python310-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python310-ipyvue >= 1.7 with python310-ipyvue < 2 \
python-abi"

inherit rpm
