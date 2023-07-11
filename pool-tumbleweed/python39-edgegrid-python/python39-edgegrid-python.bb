SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-edgegrid-python-1.2.1-1.10.noarch.rpm"
RPM_HASH = "0e367896165db6d95d124a460a4b472088d1d765e92498f0378e1a94a3432e2d7c6673b086451010dd9d9d9f71782ae8a888e1c28384753d6422e02a6151f590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-edgegrid-python \
python39-edgegrid-python \
python3dist-edgegrid-python"

RDEPENDS:${PN} += "python-abi \
python39-ndg-httpsclient \
python39-pyOpenSSL \
python39-pyasn1 \
python39-requests \
python39-urllib3"

inherit rpm
