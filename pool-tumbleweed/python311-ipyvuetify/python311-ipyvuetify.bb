SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python311-ipyvuetify-1.8.10-3.1.noarch.rpm"
RPM_HASH = "2b39d32354ca48598157520c36da8d086f2c50654b051a10e8f90a4a880a7ac1ea106dfe6e11ed884a8aff72072565c7866628e146627400f46188bd92a80a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvuetify \
python3.11dist-ipyvuetify \
python311-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python311-ipyvue >= 1.7 with python311-ipyvue < 2 \
python-abi"

inherit rpm
