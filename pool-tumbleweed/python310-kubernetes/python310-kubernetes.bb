SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "27.2.0"

RPM_NAME = "python310-kubernetes-27.2.0-1.1.noarch.rpm"
RPM_HASH = "fc25aa84a9025df2b7b126f3be96156ad4c12619d3009206e128df09122a03cb5221a016417c8fa75e53550cf765b305b496c3d9235710b1a5e9f705009287c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kubernetes \
python310-kubernetes \
python3dist-kubernetes"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-certifi \
python310-google-auth \
python310-python-dateutil \
python310-requests \
python310-requests-oauthlib \
python310-setuptools \
python310-six \
python310-urllib3 \
python310-websocket-client"

inherit rpm
