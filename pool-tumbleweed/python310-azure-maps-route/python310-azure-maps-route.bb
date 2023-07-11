SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-maps-route-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "69203b1e2112f68574b9cc90dba1a99689d07236637870747dcba1b01a3eb79f4121e4ff84191e597843c11ce946b0409e79b0db075d644477221c36179eefb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-maps-route \
python310-azure-maps-route \
python3dist-azure-maps-route"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-msrest \
python310-requests"

inherit rpm
