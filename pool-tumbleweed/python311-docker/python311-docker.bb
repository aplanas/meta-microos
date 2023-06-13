SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python311-docker-5.0.3-4.1.noarch.rpm"
RPM_HASH = "d7e37e0239989a21193c512671550f6556146317316095b18d5aadc895835bad411e01481a79e732a1bb4aa5d2af24bce963033788c2e6051ea7e1b8c0a6d798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docker) \
python311-docker \
python311-docker-py \
python3dist(docker)"

RDEPENDS:${PN} += "python(abi) \
python311-docker-pycreds \
python311-paramiko \
python311-requests \
python311-websocket-client"

inherit rpm
