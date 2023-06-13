SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python39-kubernetes-26.1.0-5.1.noarch.rpm"
RPM_HASH = "992447fb527ded4de44639856e372c9cdeca55a07420c5db5f949467ffe5be741bb317f36b4642b42eca7f3244df4fbde653f9e7ab099603f574037b470a731a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kubernetes) \
python39-kubernetes \
python3dist(kubernetes)"

RDEPENDS:${PN} += "python(abi) \
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
