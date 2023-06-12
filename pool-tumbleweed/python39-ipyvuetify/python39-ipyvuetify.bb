SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python39-ipyvuetify-1.8.10-2.2.noarch.rpm"
RPM_HASH = "a01b94597e438452f2ca28442cad15a7eabac6b2ac02eb59585a1b5d4c3ffc573d4257910d40a70bd08445e54dfd73e025bf9d33ea9de7320e402829c6de64dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyvuetify) \
python39-ipyvuetify \
python3dist(ipyvuetify)"
RDEPENDS:${PN} += "(python39-ipyvue >= 1.7 with python39-ipyvue < 2) \
python(abi)"

inherit rpm
