SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python39-kubernetes-26.1.0-5.3.noarch.rpm"
RPM_HASH = "e53ba028c56e33d11780c7851878cf3d3b1c2ccd567797b6e16a3f1cf7cd76ea1b248987a0494dd63eece212c0478786f44978f739831b7b17c55550806080c1"
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
