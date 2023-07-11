SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python310-acitoolkit-0.4-6.1.noarch.rpm"
RPM_HASH = "d0996e1bf893742cb13d987feffa3de02eb74762dfd9ba98401f2a77170d2c5ef05dadbe67ac1475801b4af46c08e206683548bb09d9c14aa26b321c6cfff6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-acitoolkit \
python310-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python310-graphviz \
python310-jsonschema \
python310-requests \
python310-tabulate \
python310-websocket-client"

inherit rpm
