SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "27.2.0"

RPM_NAME = "python39-kubernetes-27.2.0-1.1.noarch.rpm"
RPM_HASH = "514d8ac71023a1d212130414a9028353c1cff43fd3b20003bfd1921b64dd46a30f23e6309ee61d29cd9deb5cab514cbdfbd92321b64976f62920ad156ea4f2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kubernetes \
python39-kubernetes \
python3dist-kubernetes"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-certifi \
python39-google-auth \
python39-python-dateutil \
python39-requests \
python39-requests-oauthlib \
python39-setuptools \
python39-six \
python39-urllib3 \
python39-websocket-client"

inherit rpm
