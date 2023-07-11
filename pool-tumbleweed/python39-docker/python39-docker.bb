SUMMARY = "A Python library for the Docker Engine API"
DESCRIPTION = "A Python library for the Docker Engine API."
LICENSE = "Apache-2.0"

PV = "6.1.3"

RPM_NAME = "python39-docker-6.1.3-1.1.noarch.rpm"
RPM_HASH = "cf2e9481f1dae775fdcd0ab6053982ca19c8c8a8000d73903f8f0ed3ee05b545383211f6faef00665238968ed2f0585ec3e64ca8519b7a2d3bc3b01d4eea4184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docker \
python39-docker \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-requests \
python39-urllib3 \
python39-websocket-client"

inherit rpm
