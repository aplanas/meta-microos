SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python310-docker-5.0.3-4.1.noarch.rpm"
RPM_HASH = "ab86efc4208269416bd0d437856ea01655c2ba8f9a2fa36ba0eb281bcf4938ca020a0a623b0db3a678a4c95442d40934cd58d577ba2484c04848ee87f0c0bf44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker \
python3-docker-py \
python3.10dist-docker \
python310-docker \
python310-docker-py \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python310-docker-pycreds \
python310-paramiko \
python310-requests \
python310-websocket-client"

inherit rpm
