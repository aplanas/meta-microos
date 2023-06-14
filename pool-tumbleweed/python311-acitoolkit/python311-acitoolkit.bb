SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python311-acitoolkit-0.4-5.5.noarch.rpm"
RPM_HASH = "c0bf801cce8f5b8fe8b8dcc40ff967c858aba474f25572ff3589c47e37aae34c43625a35e9c1fc66bc523e2a2de3524764ada3eca599ecef3d223a5e15792c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-acitoolkit \
python311-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python311-graphviz \
python311-jsonschema \
python311-requests \
python311-tabulate \
python311-websocket-client"

inherit rpm
