SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python311-ipyvuetify-1.8.10-4.1.noarch.rpm"
RPM_HASH = "00f1d9fb1e8b2bb96b519d6d0cd2ad83f7f1616920d33b73bc5ed28964b702cb5119b502410dc6bc32904921f6326c0f1505ffda2ca2f5fda36ab770f3f9b09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvuetify \
python3.11dist-ipyvuetify \
python311-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python311-ipyvue >= 1.7 with python311-ipyvue < 2 \
python-abi"

inherit rpm
