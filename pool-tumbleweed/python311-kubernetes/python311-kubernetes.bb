SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "27.2.0"

RPM_NAME = "python311-kubernetes-27.2.0-1.1.noarch.rpm"
RPM_HASH = "a14221c124872c7f973018de84d5b6a5e5136984e8a74da514becd07d2137056d1afee814a1d64d865c0c675c052f4633086db1997c9cb5a8a541f9d04f41518"
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
