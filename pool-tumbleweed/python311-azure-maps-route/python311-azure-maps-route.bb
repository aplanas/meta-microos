SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-maps-route-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "c5899ea532d4c48c0d349ed0d903367b95394cabbe8ead51b0bf90ae38702604fd65972600430807dae18d5719c49bc42fb57b363d111252cbf7f06a3fa55f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-route \
python3.11dist-azure-maps-route \
python311-azure-maps-route \
python3dist-azure-maps-route"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest \
python311-requests"

inherit rpm
