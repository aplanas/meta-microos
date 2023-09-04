SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python39-ipyvuetify-1.8.10-4.1.noarch.rpm"
RPM_HASH = "6334efd82722d07a56c70feed4e02267c485bcd3e04f01f7aefa8a07a55206b08c8879a84ca8fc201bf0a7d36237fe8ff59c5e1d209cf9fc25e1ca6b5b3b7431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyvuetify \
python39-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python39-ipyvue >= 1.7 with python39-ipyvue < 2 \
python-abi"

inherit rpm
