SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python311-kubernetes-26.1.0-5.1.noarch.rpm"
RPM_HASH = "9c9c32dc69d787640a99a65c3aa2c8c41171e5dcb42688c555f82217d63a3ae93650c216369b0b33f4c314907b778109479a39f4df1cc9fda5b0f06802caab82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kubernetes) \
python311-kubernetes \
python3dist(kubernetes)"

RDEPENDS:${PN} += "python(abi) \
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
