SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python310-acitoolkit-0.4-5.5.noarch.rpm"
RPM_HASH = "5676664febcd8281250fa4fb017da87491e5dfec587c951d6b08155d90e2c23d6c03b8954d664dac9760f6326853c126de37a6d5bb366d4c4104c4468be7f868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acitoolkit \
python3.10dist-acitoolkit \
python310-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python310-graphviz \
python310-jsonschema \
python310-requests \
python310-tabulate \
python310-websocket-client"

inherit rpm
