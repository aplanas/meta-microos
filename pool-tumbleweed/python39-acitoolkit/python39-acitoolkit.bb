SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python39-acitoolkit-0.4-6.1.noarch.rpm"
RPM_HASH = "066d9651efc9b383eab9d81e14bf5d1bf24bfbdbf789f8c3d26da0760d3142d51bdc8f261b404770887bc2bb2f3d6e95f3d66e38e9f5181c2666fe9da56b0d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-acitoolkit \
python39-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python39-graphviz \
python39-jsonschema \
python39-requests \
python39-tabulate \
python39-websocket-client"

inherit rpm
