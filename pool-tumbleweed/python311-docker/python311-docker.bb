SUMMARY = "A Python library for the Docker Engine API"
DESCRIPTION = "A Python library for the Docker Engine API."
LICENSE = "Apache-2.0"

PV = "6.1.3"

RPM_NAME = "python311-docker-6.1.3-1.1.noarch.rpm"
RPM_HASH = "5b3c1afdb2b12794b08854dfd30eee309bbe607d06dc4854009ea429d3d4352e0e305b36581adea221b466719a52a9226ff38997cd4c3e81cd3fecd03c722c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker \
python3.11dist-docker \
python311-docker \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-requests \
python311-urllib3 \
python311-websocket-client"

inherit rpm
