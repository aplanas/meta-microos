SUMMARY = "A Python library for the Docker Engine API"
DESCRIPTION = "A Python library for the Docker Engine API."
LICENSE = "Apache-2.0"

PV = "6.1.3"

RPM_NAME = "python310-docker-6.1.3-1.1.noarch.rpm"
RPM_HASH = "e65514a13d8cb8580068104f9e1cf8fd3588366dcc8146ed922fcd4d702e783ae17c4cd60d7ca6f87e5d647a3d4b044a2ec4e4ee512ac55cca3635881ed878a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docker \
python310-docker \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-requests \
python310-urllib3 \
python310-websocket-client"

inherit rpm
