SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python39-ipyvuetify-1.8.10-3.1.noarch.rpm"
RPM_HASH = "dd612ccfadffd760df60530e232b3ca51fe3e33099334d3d9439e677bff67cd47ccd47d1eb490452a439ae049e997f763dace2a6fae5ed827d4a2b74bf864d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyvuetify \
python39-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python39-ipyvue >= 1.7 with python39-ipyvue < 2 \
python-abi"

inherit rpm
