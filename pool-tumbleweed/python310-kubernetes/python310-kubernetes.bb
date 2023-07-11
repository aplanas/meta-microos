SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python310-kubernetes-26.1.0-5.3.noarch.rpm"
RPM_HASH = "832fe73f5948910c6ffb6e9b3caeda15b5d84faff1d8bb8f59a924a27670a19e02af6cdce80a669397dd94fdb1dc8191717b7d58db978718cb40c5d6906365ef"
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
