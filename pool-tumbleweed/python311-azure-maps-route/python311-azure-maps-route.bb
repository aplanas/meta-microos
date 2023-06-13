SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-maps-route-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "d07cca319bf5bd4b5e79ff9cc1b103e6d7699a536cb2cad2d7a62c37b0f74bd9cd8209b81f60ffb03d1fcddaec4db811cc2d801a5ae94eac1203cf922f69c847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-maps-route) \
python311-azure-maps-route \
python3dist(azure-maps-route)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest \
python311-requests"

inherit rpm
