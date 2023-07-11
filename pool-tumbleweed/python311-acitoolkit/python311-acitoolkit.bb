SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python311-acitoolkit-0.4-6.1.noarch.rpm"
RPM_HASH = "1227b5d78a956e7103400232818e02a5a598432534b64c00791e779e559b7eb1e23284dc4772d413de15d2de53759bef75887392b791c1cbf672a70a63e109b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acitoolkit \
python3.11dist-acitoolkit \
python311-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python311-graphviz \
python311-jsonschema \
python311-requests \
python311-tabulate \
python311-websocket-client"

inherit rpm
