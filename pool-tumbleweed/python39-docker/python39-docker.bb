SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python39-docker-5.0.3-4.1.noarch.rpm"
RPM_HASH = "0c234b55704608a1c63289de329546197fc44cf85de397c7cbc5e1078e179da546c867ec9c2b0a9a89e19d17adeec3787e595c74ed3b82c038ae8147aba7bb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docker) \
python39-docker \
python39-docker-py \
python3dist(docker)"

RDEPENDS:${PN} += "python(abi) \
python39-docker-pycreds \
python39-paramiko \
python39-requests \
python39-websocket-client"

inherit rpm
