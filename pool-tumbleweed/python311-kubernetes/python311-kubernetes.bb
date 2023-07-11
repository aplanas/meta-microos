SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python311-kubernetes-26.1.0-5.3.noarch.rpm"
RPM_HASH = "25d94310c5873a5a6a4f7286880b54e6e68cab346414a5aba58c2b12b8a6d67149cabcaa2030fd710d452b2aac959157769fb99b457232244ae258c327e3eab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kubernetes \
python3.11dist-kubernetes \
python311-kubernetes \
python3dist-kubernetes"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-certifi \
python311-google-auth \
python311-python-dateutil \
python311-requests \
python311-requests-oauthlib \
python311-setuptools \
python311-six \
python311-urllib3 \
python311-websocket-client"

inherit rpm
