SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-edgegrid-python-1.2.1-1.8.noarch.rpm"
RPM_HASH = "dca9d9bff2f910240fff2f3eebede8c86600cd91d24a3b6a438f6a5b8e15a9f1ac7533cb3b3f3fa1693d6d5307bba86d3c3c16971fcf85ae053d95d18ad213c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edgegrid-python \
python3.10dist(edgegrid-python) \
python310-edgegrid-python \
python3dist(edgegrid-python)"

RDEPENDS:${PN} += "python(abi) \
python310-ndg-httpsclient \
python310-pyOpenSSL \
python310-pyasn1 \
python310-requests \
python310-urllib3"

inherit rpm
