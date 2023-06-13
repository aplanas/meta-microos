SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-edgegrid-python-1.2.1-1.8.noarch.rpm"
RPM_HASH = "9508c81fa36b061e745f68c17afba74f88004fad5d443d7b34ec8180cc4ba68514c2a091b54ee2117e0782130127bdec61045ea325e4e53e6871560de589d541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(edgegrid-python) \
python39-edgegrid-python \
python3dist(edgegrid-python)"

RDEPENDS:${PN} += "python(abi) \
python39-ndg-httpsclient \
python39-pyOpenSSL \
python39-pyasn1 \
python39-requests \
python39-urllib3"

inherit rpm
