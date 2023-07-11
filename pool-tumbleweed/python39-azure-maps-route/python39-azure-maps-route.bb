SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-maps-route-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "1164ace3a587ecb2303a8e558c77aa7a2cc4bb535a5c108d78a98fd8a5dc3b8f58388e8200a552a8420941909c1b00e568286fe0cb836961694e167aa3783e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-maps-route \
python39-azure-maps-route \
python3dist-azure-maps-route"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-msrest \
python39-requests"

inherit rpm
